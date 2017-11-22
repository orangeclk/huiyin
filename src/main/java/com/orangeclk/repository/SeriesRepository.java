package com.orangeclk.repository;

import com.orangeclk.model.entity.SeriesEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by orangeclk on 1/9/17.
 */
@Repository
public interface SeriesRepository extends CrudRepository<SeriesEntity, Integer> {
    Optional<SeriesEntity> findByName(String name);
}
