package com.orangeclk.model.entity;

import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by orangeclk on 12/10/16.
 */
@Entity
@Immutable
public class AuthorEntity {
    @Id
    @GeneratedValue
    protected Integer id;

    @NotNull
    protected String name;

    @ManyToMany(mappedBy = "authorSet")
    protected Set<BookEntity> bookSet;

    public static AuthorEntity valueOf(String name) {
        AuthorEntity authorEntity = new AuthorEntity();
        authorEntity.setName(name);
        return authorEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBookSet(Set<BookEntity> bookSet) {
        this.bookSet = bookSet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookEntity> getBookSet() {
        return bookSet;
    }
}

