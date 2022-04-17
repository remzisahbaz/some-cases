package com.sahabt.catalog.dto.request;

import com.sahabt.library.domain.catalog.Language;

public class FindBookByLanguageRequest {
	private Language language;
	
	public FindBookByLanguageRequest() {
		
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "FindBookByLanguageRequest [language=" + language + "]";
	}

	
}
