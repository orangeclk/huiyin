package com.orangeclk.controller;

import com.orangeclk.model.Search;
import com.orangeclk.service.AuthorService;
import com.orangeclk.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.NumberUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by orangeclk on 12/9/16.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute(new Search());
        return "home";
    }

    @RequestMapping("/search")
    public String searchSubmit(final Search search) {
        boolean valid = search
                .getQuery()
                .chars()
                .mapToObj(Character::isDigit)
                .reduce(true, (x, y) -> x && y);
        if (valid) {
            return "redirect:/book/" + search.getQuery();
        } else {
            return "error";
        }
    }
}
