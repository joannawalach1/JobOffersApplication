package com.juniorjavaready.infrastructure.login;

import com.juniorjavaready.domain.login.User;
import com.juniorjavaready.domain.login.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class RegisterController {

    private UserRepository userRepository;

    @PostMapping
    public User register(User user) {
        return userRepository.saveUser(user);
    }
}
