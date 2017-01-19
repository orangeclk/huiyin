package com.orangeclk.repository;

import com.orangeclk.model.entity.PressEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by orangeclk on 1/9/17.
 */
@Repository
public interface PressRepository extends CrudRepository<PressEntity, Integer> {
    PressEntity findByName(String name);
}
