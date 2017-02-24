package com.orangeclk.model.entity;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.*;

/**
 * Created by orangeclk on 12/9/16.
 */
@Entity
public class BookEntity {
    @Id
    protected String isbn;

    @NotNull
    protected String title;

    protected String subtitle;

    @ManyToMany
    @Cascade(CascadeType.ALL)
    @NotNull
    protected Set<AuthorEntity> authorSet = new HashSet<>();

    @ManyToOne
    @Cascade(CascadeType.ALL)
    protected PressEntity press;

    @ManyToOne
    @Cascade(CascadeType.ALL)
    protected CompanyEntity company;

    @ManyToOne
    @Cascade(CascadeType.ALL)
    protected SeriesEntity series;

    @NotNull
    @Past
    protected Date date;

    @NotNull
    protected String classNum;

    @NotNull
    @ManyToOne
    @Cascade(CascadeType.ALL)
    protected CityEntity city;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Set<AuthorEntity> getAuthorSet() {
        return authorSet;
    }

    public void setAuthorSet(Set<AuthorEntity> authorSet) {
        this.authorSet = authorSet;
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

    public SeriesEntity getSeries() {
        return series;
    }

    public void setSeries(SeriesEntity series) {
        this.series = series;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }
}
