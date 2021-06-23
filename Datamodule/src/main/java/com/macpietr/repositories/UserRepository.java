package com.macpietr.repositories;

import com.macpietr.datamodel.User;

import java.util.List;

public interface UserRepository{
    User findUserById(Long id);
    User saveUser(User user);
    List<User> findAllUsers();
    List<User> saveUsers(List<User> users);

}
