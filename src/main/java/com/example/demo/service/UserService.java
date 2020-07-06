package com.example.demo.service;

import com.example.demo.config.exception.BadRequestException;
import com.example.demo.config.exception.NotFoundException;
import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired UserRepository userRepository;

    public void init() {
        if (userRepository.findAll().isEmpty()) {
            User user = new User();
            user.setName("silvio");
            create(user);

            user = new User();
            user.setName("celmy");
            create(user);
        }
    }

    public User create(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            throw new BadRequestException("Invalid name");
        }
        return userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        if (!userRepository.existsById(id)) {
            throw new NotFoundException("User does not exist");
        }
        return userRepository.getOne(id);
    }
}
