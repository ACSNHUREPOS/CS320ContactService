package Tests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import acCS320.Contact;
import acCS320.ContactService;

// Created ContactService test to test ContactService.java file via JUnit 5
// This file will allow for testing the information in ContactService.java

class ContactServiceTest {

    @Test
    // contruct a test to verify that Contact id is not null or more than 10
    // characters
    public void testContactID() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
        assertTrue(contact.getContactID() != null);
        assertTrue(contact.getContactID().length() <= 10);
    }

    /**
     * 
     */
    @Test
    // construct a test to verify a contact using a unique ID
    public void testAddContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
        assertTrue(contactService.addContact(contact));
    }

    /**
     * 
     */
    @Test
    // construct a test to verify contact can be updated using a unique ID
    // first name, last name, phone number, and address can be updated
    public void testUpdateContact() {
        ContactService contactService = new ContactService();
        Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
        contactService.addContact(contact);
        contact.setFirstName("John");
        contact.setLastName("Smith");
        contact.setPhoneNum("8004441800");
        contact.setAddress("221 B Baker Street");
        assertTrue(contactService.addContact(contact));
    }
}
