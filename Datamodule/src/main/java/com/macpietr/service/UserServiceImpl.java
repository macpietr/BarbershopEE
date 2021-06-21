package com.macpietr.service;

import com.macpietr.datamodel.User;
import com.macpietr.repositories.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UserServiceImpl implements UserService{

    @Inject
    private UserRepository userRepository;

    @Override
    public User findUserById(Long id) {
        return userRepository.findById(id);
    }
}
