package com.develope.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.develope.workshopmongodb.domian.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	
}
