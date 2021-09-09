package com.ust.springboot;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}