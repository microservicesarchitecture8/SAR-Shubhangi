package com.sar.contactmicroservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sar.contactmicroservices.entity.Contact;
import com.sar.contactmicroservices.service.ContactService;

@RestController
@RequestMapping("contact")
public class ContactController {
	
	@Autowired
	private ContactService service;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContact(@PathVariable("userId") int userId){
		return service.getContactOfUser(userId);
	}

}
