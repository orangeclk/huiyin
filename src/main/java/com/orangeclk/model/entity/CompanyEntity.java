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
public class CompanyEntity {
    @Id
    @GeneratedValue
    protected int id;

    @NotNull
    protected String name;

    @OneToMany(mappedBy = "company")
    protected Set<BookEntity> bookSet;

    @OneToMany(mappedBy = "company")
    protected Set<SeriesEntity> seriesSet;

    public static CompanyEntity valueOf(String name) {
        CompanyEntity companyEntity = new CompanyEntity();
        companyEntity.setName(name);
        return companyEntity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Set<SeriesEntity> getSeriesSet() {
        return seriesSet;
    }

}
