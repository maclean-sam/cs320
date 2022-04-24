package contact;
public class Contact {
	
	//Declare variables and maximums for variables
    String contactId;
    String firstName;
    String lastName;
    String phoneNum;
    String address;

    int contactIdMax = 10;
    int firstNameMax = 10;
    int lastNameMax = 10;
    int phoneNumMax= 10;
    int addressMax = 30;

    public Contact(String contactId, String firstName, String lastName, String phoneNum, String address) {
        verifyContactId(contactId);
        verifyFirstName(firstName);
        verifyLastName(lastName);
        verifyPhoneNum(phoneNum);
        verifyAddress(address);
    }

    //Get Methods
    public String getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getAddress() {
        return address;
    }

    //Set Methods
    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Make sure ID is not null or greater than 10 characters
    public void verifyContactId(String contactId) {
        if (contactId != null) {
            if (contactId.length() <= contactIdMax) {
                this.contactId = contactId;
            }
            else {
                throw new IllegalArgumentException("Contact ID may not be null");
            }
        }
        else {
        	throw new IllegalArgumentException("Contact ID may not be greater than 10 characters");
        }
    }

    //Make sure name, phone number, and address do not exceed limit and are not null
    public void verifyFirstName(String firstName) {
        if (firstName != null) {
            if (firstName.length() <= firstNameMax) {
                this.firstName = firstName;
            }
            else {
            	//if first name is too long, throw exception with error message
                throw new IllegalArgumentException("First name may not be greater than 10 characters");
            }
        }
        else {
        	//if first name is null, throw exception with error message
        	throw new IllegalArgumentException("First name may not be null");
        }
    }

    public void verifyLastName(String lastName) {
        if (lastName != null) {
            if (lastName.length() <= lastNameMax) {
            	this.lastName = lastName;
            }
            else {
            	throw new IllegalArgumentException("Last name exceeds length of 10 characters");
            }
        }
        else {
        	throw new IllegalArgumentException("Last name may not be null");
        }
            
    }

    public void verifyPhoneNum(String phoneNum) {
        if (phoneNum != null) {
            if (phoneNum.length() <= phoneNumMax) {
            	this.phoneNum = phoneNum;
            }
            else {
            	throw new IllegalArgumentException("Phone number exceeds length of 10 characters");
            }
        }
        else {
        	throw new IllegalArgumentException("Phone Number may not be null");
      
        }
    }

    public void verifyAddress(String address) {
        if (address != null) {
            if (address.length() <= addressMax) {
            	this.address = address;
            }
            else {
            	throw new IllegalArgumentException("Address exceeds length of 20 characters");
            }
        }
        else {
        	throw new IllegalArgumentException("Address may not be null");
        }
    }

}

