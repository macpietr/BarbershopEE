package com.macpietr;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EntityManagerProducer {

    @PersistenceContext(unitName = "barbershopee")
    private EntityManager entityManager;

    @ApplicationScoped
    @Produces
    public EntityManager getEntityManager(){
        return entityManager;
    }
}
