package com.nisum.spring.springmvcOrm.repository.daoImpl;

import com.nisum.spring.springmvcOrm.domain.User;
import com.nisum.spring.springmvcOrm.repository.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public int create(User user) {
        Integer res = (Integer) hibernateTemplate.save(user);
        return res;
    }

    @Override
    public List<User> findAll() {
        return hibernateTemplate.loadAll(User.class);
    }

    @Override
    public User findUser(int id) {
        return hibernateTemplate.get(User.class,id);
    }
}
