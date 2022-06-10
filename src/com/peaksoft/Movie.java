package com.peaksoft;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor

public class Movie implements Comparable<Movie> {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> cast;


    @Override
    public int compareTo(Movie o) {
        return o.getDirector().getName().compareTo(this.getName());
    }
}
