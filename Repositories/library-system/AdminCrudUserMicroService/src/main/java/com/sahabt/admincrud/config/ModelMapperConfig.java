package com.sahabt.admincrud.config;

import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Configuration;

import com.sahabt.admincrud.document.UserDocument;
import com.sahabt.admincrud.dto.request.Address;
import com.sahabt.admincrud.dto.request.Email;
import com.sahabt.admincrud.dto.request.HireUserRequest;
import com.sahabt.admincrud.dto.request.Phone;
import com.sahabt.admincrud.dto.userResponse.UserResponse;
import com.sahabt.library.domain.user.User;

@Configuration
public class ModelMapperConfig {

	private static final Converter<HireUserRequest, User> HIRE_USER_REQUEST_TO_USER_CONVENTER = (context) -> {
		var request = context.getSource();
		var email = Email.of(
				request.getContact().getEmail().getEmail(),
				request.getContact().getEmail().getEmailType());
		
		var phone = Phone.of(
				request.getContact().getPhone().getPhoneNumber(),
				request.getContact().getPhone().getPhoneType());
		
		var address = Address.of(request.getContact().getAddress().getApartmentNumber(),
				request.getContact().getAddress().getBuldingNumber(), 
				request.getContact().getAddress().getCity(),
				request.getContact().getAddress().getCountry(), 
				request.getContact().getAddress().getDistrict(),
				request.getContact().getAddress().getNeighbourdhood(),
				request.getContact().getAddress().getAddressType());

		return new User.Builder().identityNo(request.getIdentityNo())
				.fullName(request.getFullName().getFirstName(), request.getFullName().getLastName())
				.birthDate(
						request.getBirthDate().getDay(),
						request.getBirthDate().getMount(),
						request.getBirthDate().getYear())
//				.contact(
//						email, phone, address
//				)
				.faculty(request.getFaculty().getFacultyName(), request.getFaculty().getFoundationYear())
				.status(request.getStatus().name())
				.photo(request.getPhoto().getValue())
				.build();

	};

	private static final Converter<UserDocument, User> USER_DOCUMENT_TO_USER_CONVERTER= (context) -> {
		var document = context.getSource();
//		var email = Email.of(
//				request.getContact().getEmail().getEmail(),
//				request.getContact().getEmail().getEmailType());
//		
//		var phone = Phone.of(
//				request.getContact().getPhone().getPhoneNumber(),
//				request.getContact().getPhone().getPhoneType());
//		
//		var address = Address.of(request.getContact().getAddress().getApartmentNumber(),
//				request.getContact().getAddress().getBuldingNumber(), 
//				request.getContact().getAddress().getCity(),
//				request.getContact().getAddress().getCountry(), 
//				request.getContact().getAddress().getDistrict(),
//				request.getContact().getAddress().getNeighbourdhood(),
//				request.getContact().getAddress().getAddressType());

		return new User.Builder()
				.identityNo(document.getIdentityNo())
				.fullName(document.getFullName().getFirstName(), document.getFullName().getLastName())
				.birthDate(
						document.getBirthDate().getDay(),
						document.getBirthDate().getMount(),
						document.getBirthDate().getYear())
//				.contact(
//						email, phone, address
//				)
				.faculty(document.getFaculty().getFacultyName(), document.getFaculty().getFoundationYear())
				.status(document.getStatus().name())
				.photo(document.getPhoto().getValue())
				.build();

	};
	
	private static final Converter<User, UserResponse> USER_TO_USER_RESPONSE_CONVERTER= (context) -> {
		var user = context.getSource();
		var response= new UserResponse();
		response.setFirstName(null);
		return response;

	};
	
	public ModelMapper modelMapper() {
		var modelMapper= new ModelMapper();
		modelMapper.addConverter(HIRE_USER_REQUEST_TO_USER_CONVENTER ,HireUserRequest.class,User.class);
		modelMapper.addConverter(USER_DOCUMENT_TO_USER_CONVERTER ,UserDocument.class,User.class);
		modelMapper.addConverter(USER_TO_USER_RESPONSE_CONVERTER ,User.class,UserResponse.class);
		
		return modelMapper();
	}
}
