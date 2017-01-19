package com.orangeclk.service;

import com.orangeclk.model.NewBook;
import com.orangeclk.model.entity.CompanyEntity;
import com.orangeclk.model.entity.PressEntity;
import com.orangeclk.model.entity.SeriesEntity;

/**
 * Created by orangeclk on 1/9/17.
 */
public interface SeriesService {
    SeriesEntity findByName(String name);
    SeriesEntity findOne(int id);
    SeriesEntity save(String name, CompanyEntity company, PressEntity press);
}
