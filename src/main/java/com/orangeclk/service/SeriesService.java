package com.orangeclk.service;

import com.orangeclk.model.NewBook;
import com.orangeclk.model.entity.CompanyEntity;
import com.orangeclk.model.entity.PressEntity;
import com.orangeclk.model.entity.SeriesEntity;

import java.util.Optional;

/**
 * Created by orangeclk on 1/9/17.
 */
public interface SeriesService {
    Optional<SeriesEntity> findByName(String name);
    SeriesEntity findOne(int id);
    SeriesEntity save(String name, CompanyEntity company, PressEntity press);
}
