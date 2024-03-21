package com.ninad.springpractice.movieapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.ninad.springpractice.movieapp.models.Movie;
import com.ninad.springpractice.movieapp.models.Review;
import com.ninad.springpractice.movieapp.repositories.ReviewRepository;

@Service
public class ReviewService {

    @Autowired  //This annotation is used to inject the dependency
    private ReviewRepository reviewRepository;  //ReviewRepository is an interface that extends MongoRepository, we will use this to perform CRUD operations on the database

    @Autowired
    private MongoTemplate mongoTemplate;    //MongoTemplate is a class that provides the implementation of the MongoOperations interface, which is used to perform CRUD operations on the database

    public Review createReview(String reviewBody, String imdbId){
        Review review = reviewRepository.insert(new Review(reviewBody));     //inserts a new document in the database
        
        mongoTemplate.update(Movie.class)   //updates the movie document in the database
            .matching(Criteria.where("imdbId").is(imdbId))  //matches the movie document with the given imdbId
            .apply(new Update().push("reviewIds").value(review))  //pushes the review document into the reviews array of the movie document
            .first();   //updates the first document that matches the criteria

        return review;
    }
}
