package com.orangeclk.service;

import com.orangeclk.model.NewBook;
import com.orangeclk.model.entity.CompanyEntity;
import com.orangeclk.model.entity.PressEntity;
import com.orangeclk.model.entity.SeriesEntity;
import com.orangeclk.repository.CompanyRepository;
import com.orangeclk.repository.PressRepository;
import com.orangeclk.repository.SeriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by orangeclk on 1/9/17.
 */
@Service
public class SeriesServiceImpl implements SeriesService {
    protected final SeriesRepository seriesRepository;

    public SeriesServiceImpl(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    @Override
    public SeriesEntity save(String name, CompanyEntity company, PressEntity press) {
        if (name.equals("")) {
            return null;
        }
        SeriesEntity seriesEntity = seriesRepository.findByName(name);
        if (seriesEntity != null) {
            return seriesEntity;
        } else {
            seriesEntity = new SeriesEntity();
            seriesEntity.setName(name);
            seriesEntity.setCompany(company);
            seriesEntity.setPress(press);
            return seriesRepository.save(seriesEntity);
        }
    }

    @Override
    public SeriesEntity findByName(String name) {
        return seriesRepository.findByName(name);
    }

    @Override
    public SeriesEntity findOne(int id) {
        return seriesRepository.findOne(id);
    }
}
