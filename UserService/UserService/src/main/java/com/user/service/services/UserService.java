package com.user.service.services;

import com.user.service.entities.User;

import java.util.List;

public interface UserService {

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get Single user of given userID
    User getUser(String userId);
}
