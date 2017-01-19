package com.orangeclk.service;

import com.orangeclk.model.entity.CityEntity;
import com.orangeclk.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by orangeclk on 1/9/17.
 */
@Service
public class CityServiceImpl implements CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public CityEntity findByName(String name) {
        return cityRepository.findByName(name);
    }

    @Override
    public CityEntity save(String name) {
        CityEntity cityEntity = cityRepository.findByName(name);
        return cityEntity == null
                ? cityRepository.save(CityEntity.valueOf(name))
                : cityEntity;
    }

    @Override
    public CityEntity findOne(int id) {
        return cityRepository.findOne(id);
    }
}
