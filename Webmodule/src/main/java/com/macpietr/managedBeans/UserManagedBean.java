package com.macpietr.managedBeans;

import com.macpietr.datamodel.User;
import com.macpietr.service.UserService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class UserManagedBean {

    @Inject
    private UserService userService;

    private User user;
    private List<User> users;

    @PostConstruct
    public void init(){
        user = new User();
    }

    public String submitUser(){
        userService.saveUser(user);
        UIViewRoot view = FacesContext.getCurrentInstance().getViewRoot();
        return view.getViewId() + "?faces-redirect=true";
    }

    public List<User> getUsers(){
        users = userService.findUseres();
        return users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
