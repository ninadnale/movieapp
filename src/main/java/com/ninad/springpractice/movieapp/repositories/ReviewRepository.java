package com.ninad.springpractice.movieapp.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ninad.springpractice.movieapp.models.Review;

//Repositories of type interface are used to perform CRUD operations on the database
//As this ReviewRepository extends MongoRepository, 
//it will have all the methods to perform CRUD operations which are already implemented in MongoRepository
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId>{


    
}
