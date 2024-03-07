package com.ninad.springpractice.movieapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//In this class we will write database access methods
@Service
public class MovieService {

    //Autowired is used to instantiate the object of MovieRepository
    // as it needs to be initialized before we use it
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(String id){
        return movieRepository.findMovieByImdbId(id);
    }

}
