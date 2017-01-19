package com.orangeclk.controller;

import com.orangeclk.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by orangeclk on 1/14/17.
 */
@Controller
public class CityController {
    protected final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @RequestMapping("/city/{id}")
    public String city(Model model, @PathVariable("id") int id) {
        model.addAttribute(cityService.findOne(id));
        return "city";
    }
}
