package com.macpietr.repositories;

import com.macpietr.datamodel.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserRepositoryImpl implements UserRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User findUserById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public User saveUser(User user) {
        if(user.getId()==null){
            entityManager.persist(user);
        }else {
            entityManager.merge(user);
        }
        return user;
    }
}
