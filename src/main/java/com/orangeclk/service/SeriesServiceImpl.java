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

import java.util.Optional;

/**
 * Created by orangeclk on 1/9/17.
 */
@Service
public class SeriesServiceImpl implements SeriesService {
    private final SeriesRepository seriesRepository;

    public SeriesServiceImpl(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    @Override
    public SeriesEntity save(String name, CompanyEntity company, PressEntity press) {
        if (name.equals("")) {
            return null;
        }

        return seriesRepository
                .findByName(name)
                .orElseGet(() -> {
                    SeriesEntity seriesEntity = new SeriesEntity();
                    seriesEntity.setName(name);
                    seriesEntity.setCompany(company);
                    seriesEntity.setPress(press);
                    return seriesRepository.save(seriesEntity);
                });
    }

    @Override
    public Optional<SeriesEntity> findByName(String name) {
        return seriesRepository.findByName(name);
    }

    @Override
    public SeriesEntity findOne(int id) {
        return seriesRepository.findOne(id);
    }
}
