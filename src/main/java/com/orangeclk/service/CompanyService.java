package com.orangeclk.service;

import com.orangeclk.model.entity.CompanyEntity;

import java.util.Optional;

/**
 * Created by orangeclk on 1/9/17.
 */
public interface CompanyService {
    Optional<CompanyEntity> findByName(String name);
    CompanyEntity save(String name);
    CompanyEntity findOne(int id);
}
