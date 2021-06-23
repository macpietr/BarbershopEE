package com.macpietr.service;

import com.macpietr.datamodel.User;
import com.macpietr.repositories.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UserService {

    @Inject
    UserRepository userRepository;

    public User saveUser(User user){
        userRepository.saveUser(user);
        return user;
    }

    public List<User> findUseres(){
        return userRepository.findAllUsers();
    }
}
