package com.ust.springboot;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@EnableMongoRepositories
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}