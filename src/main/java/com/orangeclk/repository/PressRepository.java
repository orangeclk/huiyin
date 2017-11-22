package com.orangeclk.repository;

import com.orangeclk.model.entity.PressEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by orangeclk on 1/9/17.
 */
@Repository
public interface PressRepository extends CrudRepository<PressEntity, Integer> {
    Optional<PressEntity> findByName(String name);
}
