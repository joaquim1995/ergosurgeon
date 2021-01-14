package com.mei.ergosurgeon.process.config;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

public class JavaMailSenderConfig {

    public static JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl
                mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.office365.com");
        mailSender.setPort(587);

        mailSender.setUsername("a10201@alunos.ipca.pt");
        mailSender.setPassword("Now_I_Know_You");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.required", "true");

        return mailSender;
    }
}
