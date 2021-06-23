package com.macpietr.repositories;

import com.macpietr.datamodel.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

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

    @Override
    public List<User> findAllUsers() {
        return entityManager.createQuery("select u from User u").getResultList();
    }
}
