package com.orangeclk.controller;

import com.orangeclk.model.entity.BookEntity;
import com.orangeclk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by orangeclk on 12/25/16.
 */
@Controller
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/book/{isbn}")
    public String book(@PathVariable("isbn") String isbn, Model model) { //TODO try to remove ("isbn")
        BookEntity bookEntity = bookService.findByIsbn(isbn);
        if (null == bookEntity) {
            return "error";
        }
        model.addAttribute(bookEntity);
        return "book";
    }
}
