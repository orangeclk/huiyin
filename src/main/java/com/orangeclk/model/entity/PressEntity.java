package com.orangeclk.model.entity;

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
public class PressEntity {
    @Id
    @GeneratedValue
    protected int id;

    @NotNull
    protected String name;

    @OneToMany(mappedBy = "press")
    protected Set<BookEntity> bookSet;

    @OneToMany(mappedBy = "press")
    protected Set<SeriesEntity> seriesSet;

    public static PressEntity valueOf(String name) {
        PressEntity pressEntity = new PressEntity();
        pressEntity.setName(name);
        return pressEntity;
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
