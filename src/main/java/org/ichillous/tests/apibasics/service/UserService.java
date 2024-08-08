package org.ichillous.tests.apibasics.service;

import org.ichillous.tests.apibasics.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public interface UserService {
/*  An interface that defines methods for business operations
    Contains business logic, orchestrates the use of repositories, and performs data transformations
    Separates business logic from other layers, improving modularity and testability
*/

    public abstract User createUser(User user);
    public abstract User updateUser(Long id, User userDetails);
    public abstract void deleteUser(Long id);
    public abstract Optional<User> getUserById(Long id);
    public abstract Collection<User> getAllUsers();



}



// TODO: Implement UserService
//  - Define business logic methods
//  - Implement methods using UserRepository
//  - Reason: To encapsulate business logic and provide a layer of abstraction between controllers and data access
