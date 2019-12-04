package com.tencorners.demospringjavamail.bootstrap;

import com.tencorners.demospringjavamail.model.User;
import com.tencorners.demospringjavamail.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserService userService;

    public DataLoader(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setId(1);
        user.setFirstName("Travis");
        user.setLastName("Beste");
        user.setEmailAddress("travis@tencorners.com");

        userService.save(user);

        System.out.println("Added users...");
    }
}
