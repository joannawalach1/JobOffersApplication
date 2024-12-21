package com.juniorjavaready.domain.login;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> users = new ArrayList<User>();
    public User saveUser(User user) {
        return User.builder()
                .login(user.login())
                .password(user.password())
                .build();
    }

    public User findUserByUsername(String username) throws UserNotFoundException {
        return users.stream()
                .filter(user -> user.login().equals(username))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }
}
