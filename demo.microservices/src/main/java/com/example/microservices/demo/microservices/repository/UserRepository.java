package com.example.microservices.demo.microservices.repository;

import com.example.microservices.demo.microservices.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
