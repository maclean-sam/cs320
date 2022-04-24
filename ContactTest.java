package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ContactTest {
	
	@Test
	void testContactIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("2183781273817123", "John", "Smith", "6036036033", "416 Bear Road");
		});}
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact(null, "John", "Smith", "6036036033", "416 Bear Road");
		});}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234", "Johnjohnjohnjohn", "Smith", "6036036033", "416 Bear Road");
		});}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234", null, "Smith", "6036036033", "416 Bear Road");
		});}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234", "John", "SmithSmithSmithSmith", "6036036033", "416 Bear Road");
		});}
	
	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234", "John", null, "6036036033", "416 Bear Road");
		});}
	
	@Test
	void testPhoneNumTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234", "John", "Smith", "603603621322033", "416 Bear Road");
		});}
	
	@Test
	void testPhoneNumNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234", "John", "Smith", null, "416 Bear Road");
		});}
	
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234", "John", "Smith", "6036036033", "416 Bear Roooooooooooooooooooooooooooooad");
		});}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("1234", "John", "Smith", "6036036033", null);
		});}
	
	@Test
	void testGetId() {

		Contact contact = new Contact("1234", "John", "Smith", "6036036033", "416 Bear Road");
		assertEquals("1234",contact.getContactId());
	}
	
	@Test
	void testGetFirstName() {

		Contact contact = new Contact("1234", "John", "Smith", "6036036033", "416 Bear Road");
		assertEquals("John",contact.getFirstName());
	}
	
	@Test
	void testGetLastName() {

		Contact contact = new Contact("1234", "John", "Smith", "6036036033", "416 Bear Road");
		assertEquals("Smith",contact.getLastName());
	}
	
	@Test
	void testGetPhoneNum() {

		Contact contact = new Contact("1234", "John", "Smith", "6036036033", "416 Bear Road");
		assertEquals("6036036033",contact.getPhoneNum());
	}
	
	@Test
	void testGetAddress() {

		Contact contact = new Contact("1234", "John", "Smith", "6036036033", "416 Bear Road");
		assertEquals("416 Bear Road",contact.getAddress());
	}

	@Test
	void testSetAddress() {

		Contact contact = new Contact("1234", "John", "Smith", "6036036033", "416 Bear Road");
		contact.setAddress("410 Bear Road");
		assertEquals("410 Bear Road",contact.getAddress());
	}
	
	@Test
	void testSetId() {

		Contact contact = new Contact("1234", "John", "Smith", "6036036033", "416 Bear Road");
		contact.setContactId("12345");
		assertEquals("12345",contact.getContactId());
	}
	
	@Test
	void testSetFirstName() {

		Contact contact = new Contact("1234", "John", "Smith", "6036036033", "416 Bear Road");
		contact.setFirstName("Will");
		assertEquals("Will",contact.getFirstName());
	}
	
	@Test
	void testSetLastName() {

		Contact contact = new Contact("1234", "John", "Smith", "6036036033", "416 Bear Road");
		contact.setLastName("Smooth");
		assertEquals("Smooth",contact.getLastName());
	}
	
	@Test
	void testSetPhoneNum() {

		Contact contact = new Contact("1234", "John", "Smith", "6036036033", "416 Bear Road");
		contact.setPhoneNum("6039389388");
		assertEquals("6039389388",contact.getPhoneNum());
	}
}
