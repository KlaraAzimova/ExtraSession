package com.peaksoft.comparator;

import com.peaksoft.Movie;

import java.util.Comparator;

public class ComparatorByYear implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getYear() - movie2.getYear();
    }

}
