package com.macpietr.repositories;

import com.macpietr.datamodel.User;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Model;
import javax.inject.Named;
import java.util.List;

public interface UserRepository{
    User findUserById(Long id);
    User saveUser(User user);

}
