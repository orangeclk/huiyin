package com.orangeclk.repository;

import com.orangeclk.model.entity.CityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by orangeclk on 1/9/17.
 */
@Repository
public interface CityRepository extends CrudRepository<CityEntity, Integer> {
    Optional<CityEntity> findByName(String name);
}
