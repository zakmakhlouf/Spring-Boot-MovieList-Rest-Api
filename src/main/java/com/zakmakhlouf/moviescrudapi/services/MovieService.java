package com.zakmakhlouf.moviescrudapi.services;

import java.util.List;

import com.zakmakhlouf.moviescrudapi.entity.Movie;

public interface MovieService {
    
    Movie createMovie(Movie movie);

    List<Movie> getAllMovies();

    Movie getMovieById(Long movieId);

    Movie updateMovie(Movie movie);

    void deleteMovie(Long movieId);
    
}
