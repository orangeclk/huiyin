package com.orangeclk.controller;

import com.orangeclk.model.CityChange;
import com.orangeclk.model.entity.BookEntity;
import com.orangeclk.service.BookService;
import com.orangeclk.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.transaction.TransactionScoped;
import javax.transaction.Transactional;

/**
 * Created by orangeclk on 2/24/17.
 */
@Controller
public class ChangeCityController {

    final protected BookService bookService;
    final protected CityService cityService;

    @Autowired
    public ChangeCityController(BookService bookService, CityService cityService) {
        this.bookService = bookService;
        this.cityService = cityService;
    }

    @GetMapping("/change-city")
    public String changeCity(Model model) {
        model.addAttribute(new CityChange());
        return "change-city";
    }

    @PostMapping("/change-city")
    @Transactional
    public String changeCitySubmit(final CityChange cityChange) {
        BookEntity book = bookService.findByIsbn(cityChange.getIsbn());
        book.setCity(cityService.save(cityChange.getCityName()));
        bookService.save(book);
        return "redirect:/";
    }
}
