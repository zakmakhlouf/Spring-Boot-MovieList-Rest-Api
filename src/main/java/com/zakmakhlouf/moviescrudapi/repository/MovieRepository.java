package com.zakmakhlouf.moviescrudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zakmakhlouf.moviescrudapi.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    
}
