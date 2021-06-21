package com.macpietr.datamodel;

import com.macpietr.repositories.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserTest {

    @PersistenceContext
    EntityManager entityManager;

    @Inject
    UserRepository userRepository;

    User user = new User();


    void setDataForUser(){
        user.setFirstname("mack");
        user.setLastname("mackowski");
        entityManager.persist(user);
    }

}