package com.example.demo3.repository;



import com.example.demo3.domain.User;
import java.util.List;

public interface UserRepository {

    List<User> findAll();
    int save(User user);
}
