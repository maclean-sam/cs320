package contact;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	//Verify contact is added into the system
	@Test
	void testAddContact() {
		ContactService service = new ContactService();
	    Contact contact = new Contact("123", "John", "Smith", "6038488484", "63 Bare Road");
	    service.addContact(contact);
	    String id = contact.getContactId();
	    assertEquals(id,"123");
	}
	
	
	//Verify deletion of contact
	@Test
	void testDeleteContact() {
		//Create new instance of ContactService
		ContactService service = new ContactService();
	    Contact contact = new Contact("123", "John", "Smith", "6038488484", "63 Bare Road");
	    service.addContact(contact);
	    service.deleteContact(contact.contactId);
	    assertFalse(service.List.containsKey(contact.contactId));
	}
	
	//Verify update methods work correctly
	@Test
	void testUpdateFirstName() {
		//Create new instance of ContactService
		ContactService service = new ContactService();
	    Contact contact = new Contact("123", "Tim", "Smith", "6038488484", "63 Bare Road");
	    service.addContact(contact);
	    contact.setFirstName("John");
	    service.updateFirstName("123", "John");
	    
	}
	
	@Test
	void testUpdateLastName() {
		//Create new instance of ContactService
		ContactService service = new ContactService();
	    Contact contact = new Contact("123", "Tim", "Smith", "6038488484", "63 Bare Road");
	    service.addContact(contact);
	    contact.setLastName("Smooth");
	    service.updateLastName("123", "Smooth");
	    
	}
	
	@Test
	void testUpdatePhoneNum() {
		//Create new instance of ContactService
		ContactService service = new ContactService();
		
	    Contact contact = new Contact("123", "Tim", "Smith", "6038488484", "63 Bare Road");
	    service.addContact(contact);
	    contact.setPhoneNum("6036036033");
	    service.updatePhoneNum("123", "6036036033");
	    
	}
	
	@Test
	void testUpdateAddress() {
		//Create new instance of ContactService
		ContactService service = new ContactService();
	    Contact contact = new Contact("123", "Tim", "Smith", "6038488484", "63 Bare Road");
	    service.addContact(contact);
	    contact.setAddress("31 Bush St");
	    service.updateAddress("123", "31 Bush St");
	    
	}
	
	@Test
	void testGetMethods() {
		//Create new contact object
		Contact contact = new Contact("123", "Tim", "Smith", "6038488484", "63 Bare Road");
	    contact.getContactId();
	    contact.getFirstName();
	    contact.getLastName();
	    contact.getPhoneNum();
	    contact.getAddress();
	}
}
	

