package com.ninad.springpractice.movieapp;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Repositories of type interface are used to perform CRUD operations on the database
//As this MovieRepository extends MongoRepository, 
//it will have all the methods to perform CRUD operations which are already implemented in MongoRepository
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{

    Optional<Movie> findMovieByImdbId(String imdbId);

}
