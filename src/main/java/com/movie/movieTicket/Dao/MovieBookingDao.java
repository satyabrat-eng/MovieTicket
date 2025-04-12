package com.movie.movieTicket.Dao;

import java.util.List;
import com.movie.movieTicket.Entity.Movie;

public interface MovieBookingDao {
    List<Movie> getAllMovies();

    Movie getMovieById(int id);

    void addMovies(Movie movie);

    void updateRating(Movie movie);

    void deleteMovie(int id);
}
