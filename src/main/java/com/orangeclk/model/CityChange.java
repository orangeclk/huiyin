package com.orangeclk.model;

import com.orangeclk.model.entity.BookEntity;
import com.orangeclk.service.BookService;
import com.orangeclk.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by orangeclk on 2/24/17.
 */
public class CityChange {
    protected String isbn;
    private String cityName;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
