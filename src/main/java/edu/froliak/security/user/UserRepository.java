package edu.froliak.security.user;

/*
  @author eugen
  @project security
  @class UserRepository
  @version 1.0.0
  @since 11/14/2025 - 09.05
*/

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}