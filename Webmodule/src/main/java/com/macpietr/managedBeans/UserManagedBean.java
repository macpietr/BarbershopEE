package com.macpietr.managedBeans;

import com.macpietr.datamodel.User;
import com.macpietr.repositories.UserRepository;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Named
@Getter @Setter
public class UserManagedBean {

    private User user = new User();
    private List<User> users = new ArrayList<>();

    @Inject
    UserRepository userRepository;

    public List<User> getUsers(){
        users = userRepository.findAllUsers();
        return users;
    }

    public void saveUserInDB(){
        userRepository.saveUser(user);
    }
}
