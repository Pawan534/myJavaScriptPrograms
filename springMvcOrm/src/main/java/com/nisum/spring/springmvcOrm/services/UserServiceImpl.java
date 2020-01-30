package com.nisum.spring.springmvcOrm.services;

import com.nisum.spring.springmvcOrm.domain.User;
import com.nisum.spring.springmvcOrm.repository.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao dao;

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public int save(User user) {
        return dao.create(user);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = dao.findAll();
        Collections.sort(users);
        return users;
    }

    @Override
    public User getUser(int id) {
        return dao.findUser(id);
    }
}
