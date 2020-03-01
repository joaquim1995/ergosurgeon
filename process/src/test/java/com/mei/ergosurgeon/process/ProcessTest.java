package com.mei.ergosurgeon.process;


import com.mei.ergosurgeon.schema.entities.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Properties;

@RunWith(SpringRunner.class)
public class ProcessTest {

    public JavaMailSender getJavaMailSender() {
        JavaMailSenderImpl
                mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.office365.com");
        mailSender.setPort(587);
        mailSender.setUsername("a10201@alunos.ipca.pt");
        mailSender.setPassword("cavufA6ec");

        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.required", "true");
        props.put("mail.debug", "true");

        return mailSender;
    }

    @Test
    public void sa()
    {

        try {
            Client item = new Client(
                    "joaquimcardoso12@hotmail.com",
                    "01234567-ABCD-abcd-3210-0123456789AB",
                    Instant.now(),
                    Instant.now().plus(2, ChronoUnit.MINUTES)
            );
            SimpleMailMessage msg = new SimpleMailMessage();

            msg.setFrom("a10201@alunos.ipca.pt");
            msg.setTo(item.getEmail().toString());

            msg.setSubject("Ergosurgeon");
            msg.setText("Request data on:\n" +
                    "\nhttps://ergosurgeon-evaluate-dot-investigation-265721.appspot.com:8080/" +
                    item.getEmail().toString() + "/" +
                    item.getUuid().toString() + "/" +
                    item.getDateStart().toEpochMilli() + "/" +
                    item.getDateEnd().toEpochMilli() + "\n\n" +
                    "Give it some time to process data.\n"
            );

            getJavaMailSender().send(msg);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}