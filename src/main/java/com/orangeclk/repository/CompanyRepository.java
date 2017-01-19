package com.orangeclk.repository;

import com.orangeclk.model.entity.CompanyEntity;
import org.codehaus.groovy.transform.sc.transformers.CompareIdentityExpression;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by orangeclk on 1/9/17.
 */
@Repository
public interface CompanyRepository extends CrudRepository<CompanyEntity, Integer> {
    CompanyEntity findByName(String name);
}
