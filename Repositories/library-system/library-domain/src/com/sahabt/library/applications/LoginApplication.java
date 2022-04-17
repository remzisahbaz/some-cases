package com.sahabt.library.applications;

import java.util.Optional;

import com.sahabt.library.domain.login.IdentityNo;
import com.sahabt.library.domain.login.Login;
import com.sahabt.library.domain.login.Password;

public interface LoginApplication {


	Optional<Login> login(IdentityNo identityNo, Password password);
	

}
