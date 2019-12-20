package com.example.email.services;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceImplTest {

    @Test
    void countUniqueEmails() {
        EmailServiceImpl esi = new EmailServiceImpl();
        List<String> emails = new ArrayList<String>();

        emails.add("test.email@gmail.com");
        emails.add("testemail@gmail.com");
        emails.add("test.email+spam@gmail.com");
        emails.add("jzhang@kvadata.com");
        emails.add("j.zhang@kvadata.com");
        emails.add("jzhang2@sadasd");
        emails.add("jzhangkvadata.com");
        emails.add("jzhang2@asbc.com");
        emails.add("jzhang@kvadata.com");
        emails.add("jzhang2@sadasd");
        emails.add("jzhang@kvadata.com");
        emails.add("jzhang2@sadasd");
        emails.add("jzhang@kvadata.com");
        emails.add("jzhang2@sadasd");
        assertEquals(3, esi.countUniqueEmails(emails) );







    }
}