package com.orangeclk.controller;

import com.orangeclk.service.PressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by orangeclk on 1/14/17.
 */
@Controller
public class PressController {
    protected final PressService pressService;

    @Autowired
    public PressController(PressService pressService) {
        this.pressService = pressService;
    }

    @RequestMapping("/press/{id}")
    public String press(Model model, @PathVariable("id") int id) {
        model.addAttribute(pressService.findOne(id));
        return "press";
    }
}
