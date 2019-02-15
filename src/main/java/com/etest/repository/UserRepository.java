package com.etest.repository;

import com.etest.entity.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

    @Query("{username: { $eq: ?0 } })")
    User findUserByUsername(String username);

    User findUserByToken(String token);
}
