package com.macpietr.repositories;

import com.macpietr.datamodel.User;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import javax.ejb.Stateful;
import javax.enterprise.inject.Model;
import javax.inject.Named;
import java.util.List;

@Repository
public interface UserRepository extends EntityRepository<User, Long> {
    User findById(Long id);
}
