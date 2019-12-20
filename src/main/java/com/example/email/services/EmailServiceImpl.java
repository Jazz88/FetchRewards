package com.example.email.services;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class EmailServiceImpl implements EmailService {
    @Override
    public int countUniqueEmails(List<String> emails) {
        HashSet emailSet = new HashSet();
        // valid email address pattern
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);

        for(String email : emails){
            Matcher matcher = pattern.matcher(email);
            if (!matcher.matches()) continue;
            // remove +word
            String cleanEmail = email.replaceAll("\\+.*?@", "@");
            int atIndex = cleanEmail.indexOf('@');
            //remove . before @
            String uniqueEmail = cleanEmail.substring(0, atIndex).replaceAll("\\.", "") + cleanEmail.substring(atIndex);
            emailSet.add(uniqueEmail);
        }

        return  emailSet.size();

    }
}
