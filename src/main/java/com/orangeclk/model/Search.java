package com.orangeclk.model;

import org.springframework.stereotype.Component;

/**
 * Created by orangeclk on 12/24/16.
 */
public class Search {
    protected String query;    //TODO 改成整型试试，改成id

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
