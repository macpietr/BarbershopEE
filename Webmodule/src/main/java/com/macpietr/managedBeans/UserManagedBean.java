package com.macpietr.managedBeans;

import com.macpietr.datamodel.User;
import com.macpietr.repositories.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Named
public class UserManagedBean {

    private User user = new User();

    @Inject
    UserRepository userRepository;

    public User getUser(){
        user.setFirstname("MAćK");
        userRepository.saveUser(user);
        return userRepository.findUserById(1L);
    }

    public void setUser(User user) {
        this.user = user;
    }
}
