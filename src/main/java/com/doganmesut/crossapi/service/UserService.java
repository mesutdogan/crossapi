package com.doganmesut.crossapi.service;

import com.doganmesut.crossapi.BaseService;
import com.doganmesut.crossapi.model.User;
import com.doganmesut.crossapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mesut on 02.07.2017.
 */

@Service
public class UserService implements BaseService<User,Long>{

    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        return userRepository.save(user);
    }

    @Override
    public User findOne(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
