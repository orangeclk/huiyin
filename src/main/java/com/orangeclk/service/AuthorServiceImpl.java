package com.orangeclk.service;

import com.orangeclk.model.entity.AuthorEntity;
import com.orangeclk.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by orangeclk on 12/25/16.
 */
@Service
public class AuthorServiceImpl implements AuthorService {

    final private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Optional<AuthorEntity> findByName(String name) {
        return authorRepository.findByName(name);
    }

    @Override
    public AuthorEntity save(String name) {
        return authorRepository
                .findByName(name)
                .orElse(authorRepository.save(AuthorEntity.valueOf(name)));
    }

    @Override
    public AuthorEntity findOne(int id) {
        return authorRepository.findOne(id);
    }
}
