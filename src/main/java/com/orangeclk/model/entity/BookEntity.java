package com.orangeclk.model.entity;

import com.orangeclk.model.NewBook;
import com.orangeclk.service.AuthorService;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Immutable;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.*;
import java.util.stream.Collectors;

import static javax.persistence.CacheStoreMode.REFRESH;

/**
 * Created by orangeclk on 12/9/16.
 */
@Entity
@Immutable
public class BookEntity {
    @Id
    protected String isbn;

    @NotNull
    protected String title;

    protected String subtitle;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @NotNull
    protected Set<AuthorEntity> authorSet = new HashSet<>();

    @ManyToOne(cascade = CascadeType.PERSIST)
    protected PressEntity press;

    @ManyToOne(cascade = CascadeType.PERSIST)
    protected CompanyEntity company;

    @ManyToOne(cascade = CascadeType.PERSIST)
    protected SeriesEntity series;

    @NotNull
    @Past
    protected Date date;

    @NotNull
    protected String classNum;

    @NotNull
    @ManyToOne(cascade = CascadeType.PERSIST)
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
