package com.dmdev.lesson40homework.homework9;

import java.time.Month;
import java.util.*;

public class Cinema {
    private Map<Integer, List<Film>> filmsByYear;

    public Cinema() {
        this.filmsByYear = new LinkedHashMap<>();
    }

    public void addFilm(Film film) {
        int year = film.getReleaseYear();
        List<Film> filmsInYear = filmsByYear.getOrDefault(year, new ArrayList<>());

        for (Film exitFilm : filmsInYear) {
            if (exitFilm.getId() == film.getId()) {
                return;
            }
        }
        filmsInYear.add(film);
        filmsByYear.put(year, filmsInYear);
    }

    public List<Film> getFilmsByYear(int year) {
        return new ArrayList<>(filmsByYear.getOrDefault(year, null));
    }

    public List<Film> getFilmsByYearAndMonth(int year, Month month) {
        List<Film> result = new ArrayList<>();
        for (Film film : filmsByYear.getOrDefault(year, null)) {
            if (film.getReleaseMonth() == month) {
                result.add(film);
            }
        }
        return result;
    }

    public List<Film> getFilmsByGenre(Genre genre) {
        List<Film> result = new ArrayList<>();
        for (List<Film> films : filmsByYear.values()) {
            for (Film film : films) {
                if (film.getGenre() == genre) {
                    result.add(film);
                }
            }
        }
        return result;
    }

    public List<Film> getFilmsSortedByRating() {
        List<Film> allFilms = new ArrayList<>();
        for (List<Film> films : filmsByYear.values()) {
            allFilms.addAll(films);
        }
        Collections.sort(allFilms, Comparator.comparing(Film::getReting).reversed());
        return allFilms;
    }

}
