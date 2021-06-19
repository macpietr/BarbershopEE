package com.macpietr.repositories;

import com.macpietr.datamodel.User;
import org.apache.deltaspike.data.api.Repository;

@Repository(forEntity = User.class)
public interface UserRepository {
    User findById(Long id);
    User findByFirstname(String firstname);
}
