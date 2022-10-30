package com.develope.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.develope.workshopmongodb.domian.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	
}
