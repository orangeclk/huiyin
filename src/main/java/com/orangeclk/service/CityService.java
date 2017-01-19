package com.orangeclk.service;

import com.orangeclk.model.entity.CityEntity;

/**
 * Created by orangeclk on 1/9/17.
 */
public interface CityService {
    CityEntity findByName(String name);
    CityEntity save(String name);
    CityEntity findOne(int id);
}
