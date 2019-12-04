package com.tencorners.demospringjavamail.services;

import com.tencorners.demospringjavamail.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private JavaMailSender javaMailSender;

    @Autowired
    public NotificationService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendNotification(User user) throws MailException {
        // send email

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(user.getEmailAddress());
        simpleMailMessage.setSubject("test 1");
        simpleMailMessage.setText("Hello World\nSpring Boot Java Mail");

        javaMailSender.send(simpleMailMessage);
    }
}
