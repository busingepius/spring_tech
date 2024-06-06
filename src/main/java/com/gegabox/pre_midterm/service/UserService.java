package com.gegabox.pre_midterm.service;

import com.gegabox.pre_midterm.entity.User;

import java.util.List;

interface UserService {
    List<User> getUsers();
    User getUser(long id);
    User addUser(User user);
    void updateUser(User user);
    void deleteUser(long id);;
}
