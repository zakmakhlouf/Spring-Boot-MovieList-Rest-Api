package com.zakmakhlouf.moviescrudapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.zakmakhlouf.moviescrudapi.entity.Movie;
import com.zakmakhlouf.moviescrudapi.repository.MovieRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MovieServiceImpl implements MovieService {

    private MovieRepository movieRepository;

    @Override
    public Movie createMovie(Movie movie){
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long movieId){
        Optional<Movie> optionalMovie = movieRepository.findById(movieId);
        return  optionalMovie.get();
    }

    @Override
    public Movie updateMovie(Movie movie){
        Movie existingMovie = movieRepository.findById(movie.getId()).get();
        existingMovie.setTitle(movie.getTitle());
        existingMovie.setYear(movie.getYear());
        existingMovie.setDescription(movie.getDescription());
        existingMovie.setDuration(movie.getDuration());
        existingMovie.setDirector(movie.getDirector());
        Movie updatedMovie = movieRepository.save(existingMovie);
        return updatedMovie;
    }

    @Override
    public void deleteMovie(Long movieId){
        movieRepository.deleteById(movieId);
    }
    
}
