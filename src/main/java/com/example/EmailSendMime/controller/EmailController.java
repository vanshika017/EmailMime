package com.example.EmailSendMime.controller;

import com.example.EmailSendMime.entity.EmailDetails;
import com.example.EmailSendMime.service.EmailService;
import com.rapipay.wrapperutility.email.EmailUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {


    @Autowired
    private EmailService emailService;
    @Autowired
    private JavaMailSender javaMailSender;

    private static String sender="vanshikaarya017@gmail.com";


    @PostMapping("/sendMail")
    public String
    sendMail(@RequestBody EmailDetails details)
    {
        String status = emailService.sendSimpleMail(details);

        return status;
    }
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails details)
    {

//        String status = emailService.sendMailWithAttachment(details);
//          return status;
         String result = "asdfghjkl";
         EmailUtility emailUtility=new EmailUtility(javaMailSender,sender);
        return emailUtility.sendMailWithAttachment(details.getRecipient(),details.getMsgBody(),details.getMsgBody(),details.getAttachment());

    }
}
