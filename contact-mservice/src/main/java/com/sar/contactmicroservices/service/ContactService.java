package com.sar.contactmicroservices.service;

import java.util.List;

import com.sar.contactmicroservices.entity.Contact;

public interface ContactService {
	
	List<Contact> getContactOfUser(int userId);

}
