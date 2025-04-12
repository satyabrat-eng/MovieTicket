package com.movie.movieTicket.Service;

import com.movie.movieTicket.Dao.MovieBookingDao;
import com.movie.movieTicket.Entity.Movie;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieBookingService {

    @Autowired
    MovieBookingDao movieBookingDao;

    @Transactional
    public List<Movie> getAllMovies() {
       return movieBookingDao.getAllMovies();
    }

    @Transactional
    public Movie getMovieById(int id) {
        return  movieBookingDao.getMovieById(id);
    }

    @Transactional
    public void addMovies(Movie movie) {
        movieBookingDao.addMovies(movie);
    }
    @Transactional
    public void updateRating(Movie movie){
        movieBookingDao.updateRating(movie);
    }
     @Transactional
    public void deleteMovies(int id) {
      movieBookingDao.deleteMovie(id);
    }
}
