package com.orangeclk.service;

import com.orangeclk.model.entity.CompanyEntity;
import com.orangeclk.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by orangeclk on 1/9/17.
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public CompanyEntity save(String name) {
        if (name.equals("")) {
            return null;
        }
        CompanyEntity companyEntity = companyRepository.findByName(name);
        return companyEntity == null
                ? companyRepository.save(CompanyEntity.valueOf(name))
                : companyEntity;
    }

    @Override
    public CompanyEntity findByName(String name) {
        return companyRepository.findByName(name);
    }

    @Override
    public CompanyEntity findOne(int id) {
        return companyRepository.findOne(id);
    }
}
