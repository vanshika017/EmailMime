package com.example.EmailSendMime.config;

import com.rapipay.wrapperutility.email.EmailUtility;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration
public class MyConfiguration {

    private JavaMailSender javaMailSender;
    @Value("${spring.mail.username}") private static String sender;

    @Bean
    public EmailUtility emailUtility(){
        return new EmailUtility(javaMailSender,sender);
    }
}
