package org.ichillous.tests.apibasics.repository;

import org.ichillous.tests.apibasics.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
/*  This is an interface that extends JpaRepository or CrudRepository
    Defines methods for database operations (CRUD - Create, Read, Update, Delete)
    It abstracts the data access layer, providing a clean API for database operations without exposing the underlying implementation
*/
    Optional<User> findByUsername(String username);
    List<User> findByEmail(String email);
    List<User> findByFirstName(String firstName);
    List<User> findByLastName(String lastName);


}


// TODO: Implement UserRepository
//  - Add any necessary custom query methods
//  - Reason: To define specific data access operations not covered by JpaRepository
