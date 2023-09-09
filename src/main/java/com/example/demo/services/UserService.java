package com.example.demo.services;

import com.example.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAll();

    User findById(Long id);

    User insert(User user);

    void delete(Long id);

    User update(Long id, User user);
}
