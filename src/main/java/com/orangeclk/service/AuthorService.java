package com.orangeclk.service;

import com.orangeclk.model.entity.AuthorEntity;

import java.util.Optional;

/**
 * Created by orangeclk on 12/25/16.
 */
public interface AuthorService {
    Optional<AuthorEntity> findByName(String name);
    AuthorEntity save(String name);
    AuthorEntity findOne(int id);
}
