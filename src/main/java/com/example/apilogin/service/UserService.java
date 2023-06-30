package com.example.apilogin.service;

import com.example.apilogin.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    //    private final UserRepository repository;
    private static final String EXISTING_EMAIL = "test@test.com";
    private static final String ANOTHER_EMAIL = "next@test.com";

    public Optional<UserEntity> findByEmail(String email) {
        // TODO: 18.06.2023 Move this to a database

        if (EXISTING_EMAIL.equalsIgnoreCase(email)) {
            var user = new UserEntity();
            user.setId(1L);
            user.setEmail(EXISTING_EMAIL);
            user.setPassword("$2a$12$kFtgSlc83I6.SKGWIlHXFOORmnaE.FGdrl1ygbWp0xiRK4m72Kv5O"); // test
            user.setRole("ROLE_ADMIN");
            user.setExtraInfo("My nice admin");
            return Optional.of(user);
        } else if (ANOTHER_EMAIL.equalsIgnoreCase(email)) {
            var user = new UserEntity();
            user.setId(99L);
            user.setEmail(ANOTHER_EMAIL);
            user.setPassword("$2a$12$kFtgSlc83I6.SKGWIlHXFOORmnaE.FGdrl1ygbWp0xiRK4m72Kv5O"); // test
            user.setRole("ROLE_USER");
            user.setExtraInfo("My nice user");
            return Optional.of(user);
        }

        return Optional.empty();
    }
}
