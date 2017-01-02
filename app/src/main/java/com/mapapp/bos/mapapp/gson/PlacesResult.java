package com.mapapp.bos.mapapp.gson;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Bos on 2017-01-02.
 */

public class PlacesResult extends Result implements Iterable<Place> {

    private String nextPageToken;

    private List<Place> results;

    public List<Place> asList( ) {
        return Collections.unmodifiableList( this.results );
    }

    public String getNextPageToken( ) {
        return this.nextPageToken;
    }

    @Override
    public Iterator<Place> iterator( ) {
        return this.results.iterator( );
    }

    public int size( ) {
        return this.results.size( );
    }

}