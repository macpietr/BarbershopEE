package com.macpietr.service;

import com.macpietr.datamodel.User;

public interface UserService {
    User findUserById(Long id);
}
