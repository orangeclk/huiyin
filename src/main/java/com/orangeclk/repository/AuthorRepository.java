package com.orangeclk.repository;

import com.orangeclk.model.entity.AuthorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by orangeclk on 12/25/16.
 */
@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Integer> {
    Optional<AuthorEntity> findByName(String name);
}
