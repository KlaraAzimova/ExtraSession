package com.peaksoft.interfase;

import com.peaksoft.Cast;
import com.peaksoft.Movie;

import java.util.List;

public interface SortAble {
    void sortByMovieName(List<Movie> movies);

    void sortByYear(List<Movie> movies);

    void sortByDirector(List<Movie> movies);

    void sortByActor(List<Cast> casts);
}
