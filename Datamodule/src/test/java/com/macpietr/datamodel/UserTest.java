package com.macpietr.datamodel;

import com.macpietr.repositories.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @PersistenceContext
    EntityManager entityManager;

    @Inject
    UserRepository userRepository;

    User user = new User();

    @BeforeAll
    void setDataFroUser(){
        user.setFirstname("mack");
        user.setLastname("mackowski");
        entityManager.persist(user);
    }

    @Test
    void testFindById(){
        User user1 = userRepository.findById(1L);
        assertEquals(user,user1);
    }

}