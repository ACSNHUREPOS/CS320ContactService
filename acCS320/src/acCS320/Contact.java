package acCS320;

public class Contact {

	private String contactID; // AC** contact ID
	private String firstName; // AC** first name
	private String lastName; // AC** last name
	private String phoneNum; // AC** phone number
	private String address; // AC** address

	/**
	 * @param contactID
	 * @param firstName
	 * @param lastName
	 * @param phoneNum
	 * @param address
	 */
	public Contact(String contactID, String firstName, String lastName, String phoneNum, String address) {
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}

	// if contact ID is null, Contact ID is invalid
	// if contactID is less than 10 add 0 to the front of the contact ID
	// if contact ID is greater than 10 throw an exception
	/**
	 * @return
	 */
	public String getContactID() {
		if (contactID == null) {
			throw new IllegalArgumentException("Contact ID is invalid");
		} else if (contactID.length() < 10) {
			contactID = "0" + contactID;
		} else if (contactID.length() > 10) {
			throw new IllegalArgumentException("Contact ID is invalid");
		}
		return contactID;
	}

	// if contat is is valids set and update contact ID
	/**
	 * @param contactID
	 */
	public void setContactID(String contactID) {
		if (contactID == null) {
			throw new IllegalArgumentException("Contact ID is invalid");
		} else if (contactID.length() < 10) {
			contactID = "0" + contactID;
		} else if (contactID.length() > 10) {
			throw new IllegalArgumentException("Contact ID is invalid");
		}
		this.contactID = contactID;
	}

	// if firstName is null, first name is invalid
	// if firstName is less than 2, first name is invalid
	// if firstName is greater than 10, first name is invalid
	// first name must contain only letters, ignore spaces and case
	/**
	 * @return
	 */
	public String getFirstName() {
		if (firstName == null) {
			throw new IllegalArgumentException("First name is invalid");
		} else if (firstName.length() < 2) {
			throw new IllegalArgumentException("First name is invalid");
		} else if (firstName.length() > 10) {
			throw new IllegalArgumentException("First name is invalid");
		} else if (!firstName.matches("[a-zA-Z]+")) {
			throw new IllegalArgumentException("First name is invalid");
		}
		return firstName;
	}

	// if firstName is valid, set and update first name
	/**
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (firstName == null) {
			throw new IllegalArgumentException("First name is invalid");
		} else if (firstName.length() < 2) {
			throw new IllegalArgumentException("First name is invalid");
		} else if (firstName.length() > 10) {
			throw new IllegalArgumentException("First name is invalid");
		} else if (!firstName.matches("[a-zA-Z]+")) {
			throw new IllegalArgumentException("First name is invalid");
		}
		this.firstName = firstName;
	}

	// if lastName is null, last name is invalid
	// if last Name is less than 2, last name is invalid
	// if lastName is greater than 10, last name is invalid
	// last name must contain only letters, ignore spaces and case
	/**
	 * @return
	 */
	public String getLastName() {
		if (lastName == null) {
			throw new IllegalArgumentException("Last name is invalid");
		} else if (lastName.length() < 2) {
			throw new IllegalArgumentException("Last name is invalid");
		} else if (lastName.length() > 10) {
			throw new IllegalArgumentException("Last name is invalid");
		} else if (!lastName.matches("[a-zA-Z]+")) {
			throw new IllegalArgumentException("Last name is invalid");
		}
		return lastName;
	}

	// if lastName is valid, set and update last name
	/**
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if (lastName == null) {
			throw new IllegalArgumentException("Last name is invalid");
		} else if (lastName.length() < 2) {
			throw new IllegalArgumentException("Last name is invalid");
		} else if (lastName.length() > 10) {
			throw new IllegalArgumentException("Last name is invalid");
		} else if (!lastName.matches("[a-zA-Z]+")) {
			throw new IllegalArgumentException("Last name is invalid");
		}
		this.lastName = lastName;
	}

	// phoneNumber must be exactly 10 digits
	// phoneNumber must contain only numbers, ignore spaces, dashes, and parentheses
	/**
	 * @return
	 */
	public String getPhoneNum() {
		if (phoneNum == null) {
			throw new IllegalArgumentException("Phone number is invalid");
		} else if (phoneNum.length() != 10) {
			throw new IllegalArgumentException("Phone number is invalid");
		} else if (!phoneNum.matches("[0-9]+")) {
			throw new IllegalArgumentException("Phone number is invalid");
		}
		return phoneNum;
	}

	// if phoneNumber is valid, set and update phone number
	/**
	 * @param phoneNum
	 */
	public void setPhoneNum(String phoneNum) {
		if (phoneNum == null) {
			throw new IllegalArgumentException("Phone number is invalid");
		} else if (phoneNum.length() != 10) {
			throw new IllegalArgumentException("Phone number is invalid");
		} else if (!phoneNum.matches("[0-9]+")) {
			throw new IllegalArgumentException("Phone number is invalid");
		}
		this.phoneNum = phoneNum;
	}

	// if address is null, address is invalid
	// address is less than 5, address is invalid
	// must be no longer than 30 characters
	// address must contain only letters, numbers, spaces, and punctuation
	/**
	 * @return
	 */
	public String getAddress() {
		if (address == null) {
			throw new IllegalArgumentException("Address is invalid");
		} else if (address.length() < 5) {
			throw new IllegalArgumentException("Address is invalid");
		} else if (address.length() > 30) {
			throw new IllegalArgumentException("Address is invalid");
		} else if (!address.matches("[a-zA-Z0-9\\s\\p{Punct}]+")) {
			throw new IllegalArgumentException("Address is invalid");
		}
		return address;
	}

	// if address is valid, set and update address
	/**
	 * @param address
	 */
	public void setAddress(String address) {
		if (address == null) {
			throw new IllegalArgumentException("Address is invalid");
		} else if (address.length() < 5) {
			throw new IllegalArgumentException("Address is invalid");
		} else if (address.length() > 30) {
			throw new IllegalArgumentException("Address is invalid");
		} else if (!address.matches("[a-zA-Z0-9\\s\\p{Punct}]+")) {
			throw new IllegalArgumentException("Address is invalid");
		}
		this.address = address;
	}

	// Update contact information
	/**
	 * @param firstName
	 * @param lastName
	 * @param phoneNum
	 * @param address
	 */
	public void updateContact(String firstName, String lastName, String phoneNum, String address) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNum);
		setAddress(address);
	}

	// toString method
	/**
	 * @return
	 */
	public String toString() {
		return "First Name: " + firstName + " Last Name: " + lastName + " Phone Number: " + phoneNum + " Address: "
				+ address;
	}

}
