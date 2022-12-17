package Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.management.InvalidApplicationException;

import org.junit.Test;

import acCS320.Contact; 



public class ContactTest {

	@Test

	// Test that ContactID cannot be longer than 10 characters
	// Test that contact ID cannot be less than 10 characters
	// Test that contact ID cannot be null
	public void testContactID() throws InvalidApplicationException {
		Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
		assertTrue(contact.getContactID().length() <= 10);
		assertTrue(contact.getContactID().length() < 10);
		assertTrue(contact.getContactID() != null);
	}

	@Test
	// test that first names cannot be null, and must be equal to or less than 10
	// character
	public void testFirstName() throws InvalidApplicationException {
		Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
		assertTrue(contact.getFirstName() != null);
		assertTrue(contact.getFirstName().length() <= 10);
	}

	@Test
	// test that last names cannot be null, and must be equal to or less than 10
	// character
	public void testLastName() throws InvalidApplicationException {
		Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
		assertTrue(contact.getLastName() != null);
		assertTrue(contact.getLastName().length() <= 10);
	}

	@Test
	// test that phone number cannot be null, equal to 10 character and does not
	// contain letters
	public void testPhoneNumber() throws InvalidApplicationException {
		Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
		assertTrue(contact.getPhoneNum() != null);
		assertTrue(contact.getPhoneNum().length() == 10);
		assertTrue(contact.getPhoneNum().matches("[0-9]+"));
	}

	@Test
	// test that address cannot be null, and must be equal to or less than 30
	// character
	public void testAddress() throws InvalidApplicationException {
		Contact contact = new Contact("8765432", "Jane", "Doe", "8004441800", "221 B Baker Street");
		assertTrue(contact.getAddress() != null);
		assertTrue(contact.getAddress().length() <= 30);
	}

}
