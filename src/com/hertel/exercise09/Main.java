package com.hertel.exercise09;

public class Main {

    public static void main(String[] args) {
	    EmailContact eContact = new EmailContact("Zach Hertel", "zhertel@student.cscc.edu");
	    PhoneContact pContact = new PhoneContact("Batman", "(239) 538-6934");

	    eContact.contact();
	    pContact.contact();
    }
}

abstract class Contact {
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract public void contact();
}

class EmailContact extends Contact {
    private String email;

    public EmailContact(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Emailing " + email);
    }
}

class PhoneContact extends Contact {
    private String phoneNumber;

    public PhoneContact(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void contact() {
        System.out.println("Calling " + phoneNumber);
    }
}
