package com.orangeclk.model.entity;

import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by orangeclk on 12/10/16.
 */
@Entity
@Immutable
public class CityEntity {
    @Id
    @GeneratedValue
    protected Integer id;

    @NotNull
    protected String name;

    @OneToMany(mappedBy = "city")
    protected Set<BookEntity> bookSet;

    public static CityEntity valueOf(String name) {
        CityEntity cityEntity = new CityEntity();
        cityEntity.setName(name);
        return cityEntity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setBookSet(Set<BookEntity> bookSet) {
        this.bookSet = bookSet;
    }
}
