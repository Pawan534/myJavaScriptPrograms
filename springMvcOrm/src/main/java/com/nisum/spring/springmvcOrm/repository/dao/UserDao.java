package com.nisum.spring.springmvcOrm.repository.dao;

import com.nisum.spring.springmvcOrm.domain.User;

import java.util.List;

public interface UserDao {
    int create(User user);
    List<User> findAll();
    User findUser(int id);
}
