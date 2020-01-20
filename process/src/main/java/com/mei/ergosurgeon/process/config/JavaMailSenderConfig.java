package com.mei.ergosurgeon.process.config;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class JavaMailSenderConfig {

    public static JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl
                mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);

        mailSender.setUsername("joaquimcardoso1995@gmail.com");
        mailSender.setPassword("09374abe976c80987c088256ddf4a468");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.required", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }
}
