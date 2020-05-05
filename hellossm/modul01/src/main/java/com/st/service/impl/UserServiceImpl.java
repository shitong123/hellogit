package com.st.service.impl;

import com.st.bean.User;
import com.st.dao.UserDao;
import com.st.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
//        测试事务
        throw new RuntimeException();
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public List<User> selectUsers() {
        List<User> users = userDao.selectUsers();
        return users;
    }

    @Override
    public User selectUserById(int id) {
        User user = userDao.selectUserById(id);
        return user;
    }
}
