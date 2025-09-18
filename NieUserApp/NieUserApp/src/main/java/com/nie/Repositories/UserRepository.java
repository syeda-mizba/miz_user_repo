package com.nie.Repositories;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nie.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
