package com.orangeclk.repository;

import com.orangeclk.model.entity.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by orangeclk on 12/24/16.
 */
@Repository
public interface BookRepository extends CrudRepository<BookEntity, Integer> {
    BookEntity findByIsbn(String isbn);
}
