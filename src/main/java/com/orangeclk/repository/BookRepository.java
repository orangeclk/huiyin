package com.orangeclk.repository;

import com.orangeclk.model.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by orangeclk on 12/24/16.
 */
@Repository
public interface BookRepository extends CrudRepository<BookEntity, String> {
    BookEntity findByIsbn(String isbn);
}
