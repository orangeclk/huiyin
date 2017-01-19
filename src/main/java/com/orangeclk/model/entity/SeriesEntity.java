package com.orangeclk.model.entity;

import org.springframework.http.HttpStatus;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by orangeclk on 12/10/16.
 */
@Entity
public class SeriesEntity {
    @Id
    @GeneratedValue
    protected int id;

    @NotNull
    protected String name;

    @ManyToOne(cascade = CascadeType.PERSIST)
    protected PressEntity press;

    @ManyToOne(cascade = CascadeType.PERSIST)
    protected CompanyEntity company;

    @OneToMany(mappedBy = "series")
    protected Set<BookEntity> bookSet;

    public static SeriesEntity newInstance(String name, CompanyEntity company, PressEntity press) {
        SeriesEntity seriesEntity = new SeriesEntity();
        seriesEntity.setName(name);
        seriesEntity.setCompany(company);
        seriesEntity.setPress(press);
        return seriesEntity;
    }

    public static SeriesEntity valueOf(String name) {
        SeriesEntity seriesEntity = new SeriesEntity();
        seriesEntity.setName(name);
        return seriesEntity;
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

    public PressEntity getPress() {
        return press;
    }

    public void setPress(PressEntity press) {
        this.press = press;
    }

    public CompanyEntity getCompany() {
        return company;
    }

    public void setCompany(CompanyEntity company) {
        this.company = company;
    }

    public Set<BookEntity> getBookSet() {
        return bookSet;
    }

    public void setBookSet(Set<BookEntity> bookSet) {
        this.bookSet = bookSet;
    }
}
