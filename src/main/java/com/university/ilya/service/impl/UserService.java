package com.university.ilya.service.impl;

import com.university.ilya.dao.UserRepository;
import com.university.ilya.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserService() {
    }

    public User getUserByName(String name){
        return userRepository.findUserByLogin(name);
    }
}
