package acCS320;

import java.util.ArrayList;

public class ContactService {

	ArrayList<Contact> contacts; // AC** array list of contacts

	public ContactService() { // AC** constructor

		contacts = new ArrayList<>(); // AC** initialize array list of contacts

	}

	// The contact service shall be able to add contacts with a unique ID

	public boolean addContact(Contact newContact) {

		boolean contains = false;

		for (Contact c : contacts) {

			if (c.getContactID().equalsIgnoreCase(newContact.getContactID())) {

				contains = true;

				break;

			}

		}

		if (!contains) { // AC** if contact is not in the array list add contact

			contacts.add(newContact); // AC** add contact to array list

			return true;

		} else {

			return false;

		}

	}

	// contact shall be delted using contact ID and return true if deleted

	public boolean deleteContact(String contact) { // AC** delete contact using contact ID
		boolean contains = false; // AC** boolean to check if contact is in array list

		for (Contact c : contacts) { // AC** for loop to check if contact is in array list

			if (c.getContactID().equalsIgnoreCase(contact)) { // AC** if contact is in array list

				contacts.remove(c); // AC** remove contact from array list

				contains = true; // AC** set boolean to true

				break;

			}

		}

		if (contains) { // AC** if contact is in array list return true

			return true;

		} else {

			return false;

		}

	}

	// Update first name for the given contact ID

	public boolean updateContactFirstName(String contactID, String newFirstName) {

		boolean updated = false; // AC** boolean to check if contact is updated

		for (Contact c : contacts) { // AC** for loop to check if contact is in array list

			if (c.getContactID().equalsIgnoreCase(contactID)) {

				c.setFirstName(newFirstName); // AC** set new first name

				updated = true; // AC** set boolean to true

				break;

			}

		}

		return updated;

	}

	// Update last name for the given contact ID

	public boolean updateContactLastName(String contactID, String newLastName) {

		boolean updated = false; // AC** boolean to check if contact is updated

		for (Contact c : contacts) { // AC** for loop to check if contact is in array list

			if (c.getContactID().equalsIgnoreCase(contactID)) {

				c.setLastName(newLastName); // AC** set new last name

				updated = true;

				break;

			}

		}

		return updated;

	}

	// Update number for the given contact ID

	public boolean updateContactNumber(String contactID, String newNumber) {

		boolean updated = false; // AC** boolean to check if contact is updated

		for (Contact c : contacts) { // AC** for loop to check if contact is in array list

			if (c.getContactID().equalsIgnoreCase(contactID)) { // AC** if contact is in array list

				c.setPhoneNum(newNumber); // AC** set new phone number

				updated = true;

				break;

			}

		}

		return updated;

	}

	// Update address for the given contact ID

	public boolean updateContactAddress(String contactID, String newAddress) {

		boolean updated = false;

		for (Contact c : contacts) {

			if (c.getContactID().equalsIgnoreCase(contactID)) {

				c.setAddress(newAddress);

				updated = true;

				break;

			}

		}

		return updated;

	}

	// Print all the contacts

	public void displayAllContacts() { // AC** print all contacts

		for (Contact c : contacts) {

			System.out.println(c.toString());

		}

	}

	// Update contact for the given contact ID

	public boolean updateContact(String contact) { // AC** update contact using contact ID

		boolean updated = false;

		for (Contact c : contacts) {

			if (c.getContactID().equalsIgnoreCase(contact)) {

				updated = true;

				break;

			}

		}

		return updated; // AC** return true if contact is updated

	}

	public Object getContact() { // AC** get contact
		return null;
	}

}