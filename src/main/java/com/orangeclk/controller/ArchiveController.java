package com.orangeclk.controller;

import com.orangeclk.model.entity.BookEntity;
import com.orangeclk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

/**
 * Created by orangeclk on 2/10/17.
 */
@Controller
public class ArchiveController {

    protected final BookService bookService;

    @Autowired
    public ArchiveController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/archive")
    public String archive(Model model) {
        Iterable<BookEntity> books = bookService.findAll();
        model.addAttribute("books", books);
        return "archive";
    }
}
