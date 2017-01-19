package com.orangeclk.service;

import com.orangeclk.model.entity.CompanyEntity;
import com.orangeclk.model.entity.PressEntity;

/**
 * Created by orangeclk on 1/9/17.
 */
public interface PressService {
    PressEntity findByName(String name);
    PressEntity save(String name);
    PressEntity findOne(int id);
}
