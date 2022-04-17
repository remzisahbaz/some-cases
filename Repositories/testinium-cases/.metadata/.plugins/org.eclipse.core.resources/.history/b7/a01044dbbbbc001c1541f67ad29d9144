package com.contactphone.controller;

import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.contactphone.dto.request.AddContactRequest;
import com.contactphone.dto.response.AddContactResponse;
import com.contactphone.dto.response.getContactResponse;
import com.contactphone.service.ContactService;

/**
 * @author Remzi ŞAHBAZ
 *
 */

@RestController
@RequestScope
@RequestMapping("/contacts")
@CrossOrigin
@Validated
public class ContactController {
	@Autowired
	private ContactService contactService;

	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@PostMapping
	public Optional<AddContactResponse> HireContact(@RequestBody AddContactRequest request) {
		Objects.nonNull(request);

		return contactService.addContact(request);
	}

	@GetMapping
	public Optional<getContactResponse> GetInformationContact(
			@RequestParam(required = true) String name,
			@RequestParam(required = true) String lastName) {

		Objects.nonNull(name);
		Objects.nonNull(lastName);
		System.out.println(name + " " + lastName);
		return (contactService.getContact(name, lastName));
	}
}
