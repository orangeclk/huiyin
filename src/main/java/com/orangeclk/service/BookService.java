package com.orangeclk.service;

import com.orangeclk.model.CityChange;
import com.orangeclk.model.NewBook;
import com.orangeclk.model.entity.BookEntity;

import javax.swing.text.html.Option;
import java.awt.print.Book;
import java.util.Optional;
import java.util.Set;

/**
 * Created by orangeclk on 12/24/16.
 */
public interface BookService {
    BookEntity findByIsbn(String isbn);
    BookEntity save(NewBook newBook);
    BookEntity save(BookEntity book);
    Iterable<BookEntity> findAll();
}
