package com.orangeclk.service;

import com.orangeclk.model.entity.CityEntity;

import java.util.Optional;

/**
 * Created by orangeclk on 1/9/17.
 */
public interface CityService {
    Optional<CityEntity> findByName(String name);
    CityEntity save(String name);
    CityEntity findOne(int id);
}
