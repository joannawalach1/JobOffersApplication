package com.juniorjavaready.domain.login;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> users = new ArrayList<User>();
    public User saveUser(String login, String password) {
        return User.builder()
                .login(login)
                .password(password)
                .build();
    }

    public User findUserByUsername(String username) throws UserNotFoundException {
        return users.stream()
                .filter(user -> user.login().equals(username))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(""));
    }
}
