package com.st.service;

import com.st.bean.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    List<User> selectUsers();

    User selectUserById(int id);
}
