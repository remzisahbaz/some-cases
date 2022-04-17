package com.sahabt.library.applications.bussiness;

import java.util.Optional;

import com.sahabt.library.applications.LoginApplication;
import com.sahabt.library.domain.login.IdentityNo;
import com.sahabt.library.domain.login.Login;
import com.sahabt.library.domain.login.Password;

public class StandardLoginApplication  implements LoginApplication {

	@Override
	public Optional<Login> login(IdentityNo identityNo, Password password) {
		// TODO Auto-generated method stub
		return null;
	}

}
