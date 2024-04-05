package com.example.model;

import java.util.List;

public class Contact {

    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> emails;

    public Contact(String firstName, String lastName, String company, String jobTitle, List<PhoneNumber> phoneNumbers, List<Email> emails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = phoneNumbers;
        this.emails = emails;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumbers.add(phoneNumber);
    }

    public void addEmail(Email email){
        this.emails.add(email);
    }
}
