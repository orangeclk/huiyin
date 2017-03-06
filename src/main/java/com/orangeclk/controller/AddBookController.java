package com.orangeclk.controller;

import com.orangeclk.model.NewBook;
import com.orangeclk.model.Search;
import com.orangeclk.model.entity.AuthorEntity;
import com.orangeclk.model.entity.BookEntity;
import com.orangeclk.model.entity.CityEntity;
import com.orangeclk.model.entity.SeriesEntity;
import com.orangeclk.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by orangeclk on 1/8/17.
 */
@Controller
@Secured("ROLE_ADMIN")
public class AddBookController {

    protected final BookService bookService;
    protected final AuthorService authorService;
    protected final PressService pressService;
    protected final CompanyService companyService;
    protected final SeriesService seriesService;
    protected final CityService cityService;

    @Autowired
    public AddBookController(BookService bookService,
                             AuthorService authorService,
                             PressService pressService,
                             CompanyService companyService,
                             SeriesService seriesService,
                             CityService cityService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.pressService = pressService;
        this.companyService = companyService;
        this.seriesService = seriesService;
        this.cityService = cityService;
    }

    @GetMapping("/add-book")
    public String addBook(Model model) {
        model.addAttribute(new NewBook());
        return "add-controller";
    }

    @PostMapping("/add-book")
    public String addBookSubmit(final NewBook newBook) {
        BookEntity book = bookService.save(newBook);
        return "redirect:/book/" + book.getIsbn();
    }
}
