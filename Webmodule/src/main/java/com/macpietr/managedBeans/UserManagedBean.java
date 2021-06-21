package com.macpietr.managedBeans;

import com.macpietr.datamodel.User;
import com.macpietr.repositories.UserRepository;
import com.macpietr.service.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@Transactional
@ApplicationScoped
public class UserManagedBean {

    private User user;

    @Inject
    UserService userService;

    @PersistenceContext
    EntityManager entityManager;

    public User getUser(){
        User user = new User();
        user.setFirstname("MAćK");
        entityManager.persist(user);
        return userService.findUserById(1L);
    }

}
