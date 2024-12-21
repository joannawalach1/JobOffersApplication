package com.juniorjavaready.domain.login;

public class LoginAndRegisterFacade {
    private UserRepository userRepository;

    public User findByUsername(String username) throws UserNotFoundException {
        return userRepository.findUserByUsername(username);
    }

    public User register(String username, String password) {
        return User.builder()
                .login(username)
                .password(password)
                .build();
    }
}
