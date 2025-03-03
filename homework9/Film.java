package com.dmdev.lesson40homework.homework9;

import java.time.Month;
import java.util.Objects;

public class Film {
    private int id;
    private int releaseYear;
    private Month releaseMonth;
    private Genre genre;
    private double reting;

    public Film(int id, int year, Month month, Genre genre, double reting) {
        this.id = id;
        this.releaseYear = year;
        this.releaseMonth = month;
        this.genre = genre;
        this.reting = reting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && releaseYear == film.releaseYear
                && Double.compare(reting, film.reting) == 0
                && releaseMonth == film.releaseMonth && genre == film.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, releaseYear, releaseMonth, genre, reting);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", year=" + releaseYear +
                ", month=" + releaseMonth +
                ", genre=" + genre +
                ", reting=" + reting +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Month getReleaseMonth() {
        return releaseMonth;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getReting() {
        return reting;
    }
}
