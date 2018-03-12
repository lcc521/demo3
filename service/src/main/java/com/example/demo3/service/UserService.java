package com.example.demo3.service;


import org.h2.engine.User;

import java.util.List;

public interface UserService {

    List<User> list();
    User add(User user);
}
