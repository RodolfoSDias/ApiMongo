package com.rodsdev.whorkshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.rodsdev.whorkshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String >{
    
}
