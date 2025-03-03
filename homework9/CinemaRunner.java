package com.dmdev.lesson40homework.homework9;

import java.time.Month;

public class CinemaRunner {
    public static void main(String[] args) {
        
        Film film1 = new Film(1, 2022, Month.APRIL, Genre.ADVENTURE, 7.0);
        Film film2 = new Film(2,2015,Month.MAY, Genre.COMEDY, 6.8);
        Film film3 = new Film(3, 2022, Month.DECEMBER, Genre.DOCUMENTARY, 7.8);
        Film film4 = new Film(4, 2021, Month.DECEMBER, Genre.FANTASY, 7.1);
        Film film5 = new Film(5, 2021, Month.AUGUST, Genre.HORROR, 6.1);
        Film film6 = new Film(6, 2019, Month.JULY, Genre.FANTASY, 8.0);
        Film film7 = new Film(7, 2023, Month.FEBRUARY, Genre.THRILLER, 7.3);

        Cinema cinema = new Cinema();
        cinema.addFilm(film1);
        cinema.addFilm(film2);
        cinema.addFilm(film3);
        cinema.addFilm(film4);
        cinema.addFilm(film5);
        cinema.addFilm(film6);
        cinema.addFilm(film7);

        System.out.println("Movies from 2022 year: " + cinema.getFilmsByYear(2022));
        System.out.println();
        System.out.println("Movies for december 2021: " + cinema.getFilmsByYearAndMonth(2021, Month.DECEMBER));
        System.out.println();
        System.out.println("Fantasy movies: " + cinema.getFilmsByGenre(Genre.FANTASY));
        System.out.println();
        System.out.println("Movie rating: " + cinema.getFilmsSortedByRating());
    }
}
