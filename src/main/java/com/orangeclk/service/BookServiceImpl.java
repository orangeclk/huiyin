package com.orangeclk.service;

import com.orangeclk.model.CityChange;
import com.orangeclk.model.NewBook;
import com.orangeclk.model.entity.BookEntity;
import com.orangeclk.model.entity.CompanyEntity;
import com.orangeclk.model.entity.PressEntity;
import com.orangeclk.model.entity.SeriesEntity;
import com.orangeclk.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by orangeclk on 12/24/16.
 */
@Service
public class BookServiceImpl implements BookService {

    protected final BookRepository bookRepository;
    protected final AuthorService authorService;
    protected final CityService cityService;
    protected final CompanyService companyService;
    protected final PressService pressService;
    protected final SeriesService seriesService;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, AuthorService authorService, CityService cityService, CompanyService companyService, PressService pressService, SeriesService seriesService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
        this.cityService = cityService;
        this.companyService = companyService;
        this.pressService = pressService;
        this.seriesService = seriesService;
    }

    @Override
    public BookEntity findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn);
    }

    @Override
    public BookEntity save(NewBook newBook) {
        CompanyEntity company = companyService.save(newBook.getCompany());
        PressEntity press = pressService.save(newBook.getPress());

        BookEntity bookEntity = new BookEntity();
        bookEntity.setIsbn(newBook.getIsbn());
        bookEntity.setTitle(newBook.getTitle());
        bookEntity.setSubtitle(newBook.getSubtitle());
        bookEntity.setAuthorSet(Arrays
                .stream(newBook
                    .getAuthors()
                    .split(";"))
                .map(authorService::save)
                .collect(Collectors.toSet()));
        bookEntity.setCity(cityService.save(newBook.getCity()));
        bookEntity.setCompany(company);
        bookEntity.setPress(press);
        bookEntity.setSeries(seriesService.save(
                newBook.getSeries(),
                company,
                press));
        bookEntity.setClassNum(newBook.getClassNum());
        try {
            bookEntity.setDate((new SimpleDateFormat("yyyy-MM-dd")).parse(newBook.getDate()));
        } catch (ParseException e) {
            System.err.println("ParseException:" + e.toString());
        }
        return bookRepository.save(bookEntity);
    }

    @Override
    public BookEntity save(BookEntity book) {
        System.out.println(bookRepository.exists(book.getIsbn()));
        return bookRepository.save(book);
    }

    @Override
    public Iterable<BookEntity> findAll() {
        return bookRepository.findAll();
    }
}
