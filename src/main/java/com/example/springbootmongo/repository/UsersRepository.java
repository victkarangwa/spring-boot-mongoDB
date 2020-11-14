package com.example.springbootmongo.repository;

import com.example.springbootmongo.document.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepository extends MongoRepository<Users, Integer> {
}
