package com.sahabt.library.applications;

import java.util.Optional;

import com.sahabt.library.domain.admin.Admin;

public interface AdminApplication {

	Optional<Admin> addAdmin(Admin admin);
	Optional<Admin> removeAdmin(Admin admin);
	Optional<Admin> editAdmin(Admin admin);
	Optional<Admin> getInformationAdmin(Admin admin);
	

}
