package com.movie.movieTicket.Controller;

import com.movie.movieTicket.Entity.Movie;
import com.movie.movieTicket.Service.MovieBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class MovieBookingController {

    @Autowired
    MovieBookingService movieBookingService;

    @GetMapping("/movie")
    public List<Movie> getAllMovies(){
        return movieBookingService.getAllMovies();
    }

    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable int id){
        return movieBookingService.getMovieById(id);
    }

    @PostMapping("/movie")
    public void addMovies(@RequestBody Movie movie){
        movieBookingService.addMovies(movie);
    }

    @PutMapping("/update")
    public void updateRating(@RequestBody Movie movie){
        movieBookingService.updateRating(movie);
    }

    @DeleteMapping("/movie/{id}")
    public void deleteMovies(@PathVariable int id){
    movieBookingService.deleteMovies(id);
    }
}
