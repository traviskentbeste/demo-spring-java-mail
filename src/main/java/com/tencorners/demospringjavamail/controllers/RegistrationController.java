package com.tencorners.demospringjavamail.controllers;

import com.tencorners.demospringjavamail.model.User;
import com.tencorners.demospringjavamail.services.NotificationService;
import com.tencorners.demospringjavamail.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    private Logger log = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("/signup")
    public String signup() {
        return "Please sign up for our service";
    }

    @RequestMapping("/signup-success/{id}")
    public String signupSuccess(@PathVariable("id") Integer id) {

        log.info("id is " + id);

        // get the user
        User user = userService.findById(id);

        // send a notification
        try {
            notificationService.sendNotification(user);
        } catch (MailException e) {
            // catch error
            log.info("error sending with Java Mail");
            return "error sending with Java Mail";
        }

        return "Thank you for registering with us";
    }
}
