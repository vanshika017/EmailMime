package com.example.EmailSendMime.service;


import com.example.EmailSendMime.entity.EmailDetails;

public interface EmailService {

    String sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);
}
