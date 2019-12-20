package com.example.email.controllers;

import com.example.email.services.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(EmailController.BASE_URL)
public class EmailController {
    public static final String BASE_URL ="/emails";
    private final EmailService emailService;
    public EmailController(EmailService emailService){
        this.emailService = emailService;
    }
    @PostMapping("/countUniqueEmails")
    @ResponseStatus(HttpStatus.OK)
    public int countUniqueEmails(@RequestBody List<String> emails ){
        return emailService.countUniqueEmails(emails);
    }

}
