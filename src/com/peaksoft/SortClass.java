package com.peaksoft;

import com.peaksoft.comparator.ComparatorByActor;
import com.peaksoft.comparator.ComparatorByName;
import com.peaksoft.comparator.ComparatorByYear;
import com.peaksoft.interfase.SortAble;

import java.util.Collections;
import java.util.List;

public class SortClass implements SortAble {
    @Override
    public void sortByMovieName(List<Movie> movies) {

        ComparatorByName comparatorByName = new ComparatorByName();
        movies.sort(comparatorByName);
        for (Movie movie : movies) {
            System.out.println("Фильм: " + movie.getName());
            System.out.println("Год: " + movie.getYear());
            System.out.println("Описание: " + movie.getDescription());
            System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
            System.out.println("=== * Каст * ===");
            for (Cast cast : movie.getCast()) {
                System.out.println("Актер: " + cast.getActor());
                System.out.println("Роль: " + cast.getRole());
            }
            System.out.println("------------------------------------------------");
        }
    }


    @Override
    public void sortByYear(List<Movie> movies) {
        ComparatorByYear comparatorByYear = new ComparatorByYear();
        movies.sort(comparatorByYear);
        for (Movie movie : movies) {
            System.out.println("Год: " + movie.getYear());
            System.out.println("Фильм: " + movie.getName());
            System.out.println("Описание: " + movie.getDescription());
            System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
            System.out.println("=== * Каст * ===");
            for (Cast cast : movie.getCast()) {
                System.out.println("Актер: " + cast.getActor());
                System.out.println("Роль: " + cast.getRole());
            }
            System.out.println("------------------------------------------------");
        }

    }

    @Override
    public void sortByDirector(List<Movie> movies) {
        Collections.sort(movies);
        for (Movie movie : movies) {
            System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
            System.out.println("Год: " + movie.getYear());
            System.out.println("Фильм: " + movie.getName());
            System.out.println("Описание: " + movie.getDescription());
            for (Cast cast : movie.getCast()) {
                System.out.println("Актер: " + cast.getActor());
                System.out.println("Роль: " + cast.getRole());
            }
            System.out.println("------------------------------------------------");
        }
    }

    @Override
    public void sortByActor(List<Cast> casts) {
        ComparatorByActor comparatorByActor = new ComparatorByActor();
        casts.sort(comparatorByActor);
        for (Cast cast : casts) {
            System.out.println("Актер: " + cast.getActor());
            System.out.println("Роль: " + cast.getRole());

        }
    }


}
