package com.orangeclk.service;

import com.orangeclk.model.entity.PressEntity;
import com.orangeclk.repository.PressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by orangeclk on 1/9/17.
 */
@Service
public class PressServiceImpl implements PressService {
    private final PressRepository pressRepository;

    @Autowired
    public PressServiceImpl(PressRepository pressRepository) {
        this.pressRepository = pressRepository;
    }

    @Override
    public Optional<PressEntity> findByName(String name) {
        return pressRepository.findByName(name);
    }

    @Override
    public PressEntity save(String name) {
        if (name.equals("")) {
            return null;
        }

        return pressRepository
                .findByName(name)
                .orElse(PressEntity.valueOf(name));
    }

    @Override
    public PressEntity findOne(int id) {
        return pressRepository.findOne(id);
    }
}
