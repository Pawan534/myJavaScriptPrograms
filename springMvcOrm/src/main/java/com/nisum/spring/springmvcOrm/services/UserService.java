package com.nisum.spring.springmvcOrm.services;

import com.nisum.spring.springmvcOrm.domain.User;

import java.util.List;


public interface UserService {
    int save(User user);
    List<User> getUsers();
    User getUser(int id);
}
