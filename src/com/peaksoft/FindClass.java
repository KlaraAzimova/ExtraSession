package com.peaksoft;

import com.peaksoft.interfase.FindAble;

import java.util.List;
import java.util.Scanner;


public class FindClass implements FindAble {
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void findMovieByName(List<Movie> movies) {
        try {
            System.out.print("Введите названия фильма: ");
            String name = scanner.nextLine();
            for (Movie movie : movies) {
                if (movie.getName().equals(name)) {
                    System.out.println("Фильм: " + movie.getName());
                    System.out.println("Год: " + movie.getYear());
                    System.out.println("Описание: " + movie.getDescription());
                    System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
                    System.out.println("=== * Каст * ===");
                    for (Cast cast : movie.getCast()) {
                        System.out.println("Актер: " + cast.getActor());
                        System.out.println("Роль: " + cast.getRole());
                    }
                }
                System.out.println("------------------------------------------------");
            }
            throw new YourException("Не правильное названия фильма!!!");
        } catch (YourException ex) {
           ex.printStackTrace();
        }
    }


    @Override
    public void findMovieByActor(List<Movie> movies) {
        try {
            System.out.println("Введите имя актера: ");
            String name = scanner.nextLine();
            for (Movie movie : movies) {
                for (Cast cast : movie.getCast()) {
                    if (cast.getActor().equals(name)) {
                        System.out.println("=== * Каст * ===");
                        System.out.println("Актер: " + cast.getActor());
                        System.out.println("Роль: " + cast.getRole());
                        System.out.println("Фильм: " + movie.getName());
                        System.out.println("Год: " + movie.getYear());
                        System.out.println("Описание: " + movie.getDescription());
                        System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector().getLastName());
                    }
                }
            }
            throw new YourException("Не праильное имя актера! ");
        } catch (YourException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------------------");
    }

    @Override
    public void findMovieByYear(List<Movie> movies) {
        try {
            System.out.println("Введите код фильма: ");
            int year = scanner.nextInt();
            for (Movie movie : movies) {
                if (movie.getYear() == year) {
                    System.out.println("Год: " + movie.getYear());
                    System.out.println("Фильм: " + movie.getName());
                    System.out.println("Описание: " + movie.getDescription());
                    System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector());
                    System.out.println("=== * Каст * ===");
                    for (Cast cast : movie.getCast()) {
                        System.out.println("Актер: " + cast.getActor());
                        System.out.println("Роль: " + cast.getRole());
                    }
                }

            }
            throw new YourException("Не правильное код фильма! ");
        } catch (YourException yourException) {
            System.out.println(yourException.getMessage());
        }
        System.out.println("------------------------------------------------");

    }

    @Override
    public void findMovieByDirector(List<Movie> movies) {
        try {
            System.out.println("Введите имя директора: ");
            String name = scanner.nextLine();
            for (Movie movie : movies) {
                if (movie.getDirector().getName().equals(name)) {
                    System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector());
                    System.out.println("Год: " + movie.getYear());
                    System.out.println("Фильм: " + movie.getName());
                    System.out.println("Описание: " + movie.getDescription());
                    System.out.println("=== * Каст * ===");
                    for (Cast cast : movie.getCast()) {
                        System.out.println("Актер: " + cast.getActor());
                        System.out.println("Роль: " + cast.getRole());
                    }
                }
            }
            throw new YourException("Не правильное имя директора!");
        } catch (YourException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("------------------------------------------------");
    }

    @Override
    public void findMovieByDescription(List<Movie> movies) {
        try {
            System.out.println("Описание фильма ");
            String description = scanner.nextLine();
            for (Movie movie : movies) {
                if (movie.getDescription().equals(description)) {
                    System.out.println("Описание: " + movie.getDescription());
                    System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector());
                    System.out.println("Год: " + movie.getYear());
                    System.out.println("Фильм: " + movie.getName());
                    System.out.println("=== * Каст * ===");
                    for (Cast cast : movie.getCast()) {
                        System.out.println("Актер: " + cast.getActor());
                        System.out.println("Роль: " + cast.getRole());
                    }
                }
            }
            throw new YourException("Не правильное описание!");
        } catch (YourException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("------------------------------------------------");
    }

    @Override
    public void findMovieByRole(List<Movie> movies) {
        try {
            System.out.println("Введите роль актера ");
            String role = scanner.nextLine();
            for (Movie movie : movies) {
                for (Cast cast : movie.getCast()) {
                    if (cast.getRole().equals(role)) {
                        System.out.println("=== * Каст * ===");
                        System.out.println("Актер: " + cast.getActor());
                        System.out.println("Роль: " + cast.getRole());
                        System.out.println("Описание: " + movie.getDescription());
                        System.out.println("Директор: " + movie.getDirector().getName() + " " + movie.getDirector());
                        System.out.println("Год: " + movie.getYear());
                        System.out.println("Фильм: " + movie.getName());
                    }
                }
            }
            throw new YourException("Введите правильное роль!");
        } catch (YourException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void instruction(List<Movie> movies) {
        try {
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
            throw new YourException("Нажмите правильное цифры: ");
        } catch (YourException e) {
            System.out.println(e.getMessage());
        }

    }
}
