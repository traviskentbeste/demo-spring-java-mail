package com.tencorners.demospringjavamail.services.springdatajpa;

import com.tencorners.demospringjavamail.model.User;
import com.tencorners.demospringjavamail.repositories.UserRepository;
import com.tencorners.demospringjavamail.services.UserService;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class UserSDJService implements UserService {

    private final UserRepository userRepository;

    public UserSDJService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> findAll() {
        return null;
    }

    @Override
    public User findById(Integer integer) {
        return userRepository.findById(integer).orElse(null);
    }

    @Override
    public User save(User object) {
        return userRepository.save(object);
    }

    @Override
    public void delete(User object) {

    }

    @Override
    public void deleteById(Integer integer) {

    }
}
