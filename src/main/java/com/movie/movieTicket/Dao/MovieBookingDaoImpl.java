package com.movie.movieTicket.Dao;

import com.movie.movieTicket.Entity.Movie;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieBookingDaoImpl implements MovieBookingDao{

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Movie> getAllMovies() {
        Session session=entityManager.unwrap(Session.class);
        String hql = "FROM Movie"; // HQL query
        return session.createQuery(hql, Movie.class).getResultList();
    }

    @Override
    public Movie getMovieById(int id) {
        Session session=entityManager.unwrap(Session.class);
        return session.get(Movie.class,id);
    }

    @Override
    public void addMovies(Movie movie) {
        Session session=entityManager.unwrap(Session.class);
        session.save(movie);
    }

    @Override
    public void updateRating(Movie updateMovie) {
        Session session=entityManager.unwrap(Session.class);
        Movie movie=session.get(Movie.class,updateMovie.getId());
        movie.setMovieRating(updateMovie.getMovieRating());
        session.save(movie);
    }

    @Override
    public void deleteMovie(int id) {
        Session session=entityManager.unwrap(Session.class);
        Movie movie=session.get(Movie.class,id);
        session.delete(movie);
    }


}
