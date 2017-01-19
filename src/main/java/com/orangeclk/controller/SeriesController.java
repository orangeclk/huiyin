package com.orangeclk.controller;

import com.orangeclk.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by orangeclk on 1/14/17.
 */
@Controller
public class SeriesController {
    protected final SeriesService seriesService;

    @Autowired
    public SeriesController(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    @RequestMapping("/series/{id}")
    public String series(Model model, @PathVariable("id") int id) {
        model.addAttribute(seriesService.findOne((id)));
        return "series";
    }
}
