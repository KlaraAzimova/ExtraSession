package com.peaksoft.comparator;

import com.peaksoft.Movie;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
       return o1.getName().compareTo(o2.getName());
    }
}
