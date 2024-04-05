package com.example.model;

public class PhoneNumber {

    private String phoneNumber;
    private String label;

    public PhoneNumber(String phoneNumber, String label) {
        this.phoneNumber = phoneNumber;
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLabel() {
        return label;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
