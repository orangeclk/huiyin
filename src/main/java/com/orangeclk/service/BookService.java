package com.orangeclk.service;

import com.orangeclk.model.NewBook;
import com.orangeclk.model.entity.BookEntity;

import java.util.Set;

/**
 * Created by orangeclk on 12/24/16.
 */
public interface BookService {
    BookEntity findByIsbn(String isbn);
    BookEntity save(NewBook newBook);
    Iterable<BookEntity> findAll();
}
