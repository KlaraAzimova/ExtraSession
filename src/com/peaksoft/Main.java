package com.peaksoft;

import com.peaksoft.interfase.FindAble;
import com.peaksoft.interfase.SortAble;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scannerMovie = new Scanner(System.in);
    static FindAble findAble = new FindClass();
    static SortAble sortAble = new SortClass();

    public static void main(String[] args) {

        System.out.println("Нажмите 1 найти фильм по названию");
        System.out.println("Нажмите 2 найти фильм по актеру");
        System.out.println("Нажмите 3 чтобы найти фильм по годам ");
        System.out.println("Нажмите 4 чтобы найти фильм по описаниям");
        System.out.println("Нажмите 5 чтобы найти фильм по директору");
        System.out.println("Нажмите 6 чтобы найти фильмы по ролям");
        System.out.println("Нажмите 7 чтобы отсортировать фильмы по годам ");
        System.out.println("Нажмите 8 чтобы отсортировать фильмы по актерам");
        System.out.println("Нажмите 9 чтобы отсортировать фильмы по директору");
        System.out.println("Нажмите 10 чтобы отсортировать фильмы по названиям");

        Director director = new Director("Jaulan", "Nurkamalov");
        List<Cast> casts = new ArrayList<>();
        casts.add(new Cast("Nurdin", "Cowboy"));
        casts.add(new Cast("Dastan", "Badboy"));
        casts.add(new Cast("Tologon", "Photograf"));
        casts.add(new Cast("Mukhamed", "Idea"));

        Director director1 = new Director("Ulan", "Nurkamalov");
        List<Cast> casts1 = new ArrayList<>();
        casts.add(new Cast("Nursultan", "Cowboy"));
        casts.add(new Cast("Adilet", "Badboy"));
        casts.add(new Cast("Akkyz", "Destan"));
        casts.add(new Cast("Mavlyan", "Programmer"));

        Director director2 = new Director("Nurmuhammed", "Nurbekov");
        List<Cast> casts2 = new ArrayList<>();
        casts1.add(new Cast("Nurbek", "Captain"));
        casts1.add(new Cast("Maksat", "Hacker"));
        casts1.add(new Cast("Dastan", "Hacker"));

        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Java-6", 2022, "drama", director, casts));
        movies.add(new Movie("Peaksoft", 2020, "film", director1, casts1));
        movies.add(new Movie("Avator", 2021, "film", director2, casts2));

        while (true) {
            switch (scannerMovie.nextInt()) {
                case 1:
                    findAble.instruction(movies);
                    findAble.findMovieByName(movies);
                    break;
                case 2:
                    findAble.instruction(movies);
                    findAble.findMovieByActor(movies);
                    break;
                case 3:
                    findAble.instruction(movies);
                    findAble.findMovieByYear(movies);
                    break;
                case 4:
                    findAble.instruction(movies);
                    findAble.findMovieByDescription(movies);
                    break;
                case 5:
                    findAble.instruction(movies);
                    findAble.findMovieByDirector(movies);
                    break;
                case 6:
                    findAble.instruction(movies);
                    findAble.findMovieByRole(movies);
                    break;
                case 7:
                    sortAble.sortByYear(movies);
                    break;
                case 8:
                    sortAble.sortByActor(casts);
                    break;
                case 9:
                    sortAble.sortByDirector(movies);
                    break;
                case 10:
                    sortAble.sortByMovieName(movies);
                    break;
                default:
                    System.out.println("Ошибка!!!");
            }
        }
    }
}
