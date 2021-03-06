package com.orangeclk.controller;

import com.orangeclk.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by orangeclk on 1/14/17.
 */
@Controller
public class CompanyController {
    protected final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @RequestMapping("/company/{id}")
    public String company(Model model, @PathVariable("id") int id) {
        model.addAttribute(companyService.findOne(id));
        return "company";
    }
}
