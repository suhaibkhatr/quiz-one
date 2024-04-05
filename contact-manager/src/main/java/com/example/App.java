package com.example;

import com.example.model.Contact;
import com.example.model.Email;
import com.example.model.PhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email("dave.sang@gmail.com", "Home"));
        emails.add(new Email("dsanger@argos.com", "Work"));

        List<PhoneNumber> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(new PhoneNumber("240-133-0011", "Home"));
        phoneNumbers.add(new PhoneNumber("240-112-0123", "Mobile"));


        List<Email> emails1 = new ArrayList<>();
        emails1.add(new Email("ali@bmi.com", "Work"));

        List<PhoneNumber> phoneNumbers1 = new ArrayList<>();
        phoneNumbers1.add(new PhoneNumber("412-116-9988", "Work"));

        Contact[] contacts = new Contact[]{
                new Contact("David", "Sanger", "Argos LLC", "Sales Manager",
                        phoneNumbers,
                        emails),
                new Contact("Carlos", "Jimenez", "Zappos", "Director",
                        new ArrayList<>(),
                        new ArrayList<>()),
                new Contact("Ali", "Gafar", "BMI Services", "HR Manager",
                        phoneNumbers1,
                        emails1)
        };

        // Sort contacts array by last name in ascending order
        Arrays.sort(contacts, Comparator.comparing(Contact::getLastName));

        // Convert contacts array to JSON format
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonContacts = gson.toJson(contacts);

        // Print contacts data in JSON format
        System.out.println(jsonContacts);
    }
}
