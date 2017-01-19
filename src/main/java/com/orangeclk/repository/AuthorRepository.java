package com.orangeclk.repository;

import com.orangeclk.model.entity.AuthorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by orangeclk on 12/25/16.
 */
@Repository
public interface AuthorRepository extends CrudRepository<AuthorEntity, Integer> {
    AuthorEntity findByName(String name);
}
