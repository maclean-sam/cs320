package contact;
import java.util.HashMap;
import java.util.UUID;

public class ContactService {

    //Create new HashMap for Contacts
	HashMap<String, Contact> List = new HashMap<String, Contact>();
	

    //Create unique ID using imported UUID class
    public String generateRandomId() {
    	
        String id = UUID.randomUUID().toString();
        //get the first 10 characters
        String uniqueId = id.substring(0,10);
        //return the result
        return uniqueId;
    }

    //Add a new contact to the ArrayList
    public void addContact(Contact contact) {
    	
    	//Add contact with unique ID to list
    	List.put(generateRandomId(), contact);
    }
 

    public void deleteContact(String contactId) {
        //Contact contact = new Contact();
        List.remove(contactId);
    }

    public void updateFirstName(String contactId, String firstName) {
    	Contact contact = List.get(contactId);
    	contact.setFirstName(firstName);
    }

    public void updateLastName(String contactId, String lastName) {
    	Contact contact = List.get(contactId);
    	contact.setLastName(lastName);
    }

    public void updatePhoneNum(String contactId, String phoneNum) {
    	Contact contact = List.get(contactId);
    	contact.setPhoneNum(phoneNum);
    }

    public void updateAddress(String contactId, String address) {
    	Contact contact = List.get(contactId);
    	contact.setAddress(address);
    }

}
