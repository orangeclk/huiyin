package com.orangeclk.repository;

import com.orangeclk.model.entity.CompanyEntity;
import org.codehaus.groovy.transform.sc.transformers.CompareIdentityExpression;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by orangeclk on 1/9/17.
 */
@Repository
public interface CompanyRepository extends CrudRepository<CompanyEntity, Integer> {
    Optional<CompanyEntity> findByName(String name);
}
