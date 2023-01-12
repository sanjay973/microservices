package com.user.service.respository;

import com.user.service.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    //If you want to implement any custom method or query
    //write here
}
