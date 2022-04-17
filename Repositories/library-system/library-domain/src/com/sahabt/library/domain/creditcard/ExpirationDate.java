package com.sahabt.library.domain.creditcard;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class ExpirationDate {
	
	private int mount;
	private int year;

	public static ExpirationDate of (int mount,int year) {
		return new ExpirationDate(mount,year);
	}

	private ExpirationDate(int mount, int year) {
		super();
		this.mount = mount;
		this.year = year;
	}

	public int getMount() {
		return mount;
	}

	public int getYear() {
		return year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mount, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExpirationDate other = (ExpirationDate) obj;
		return mount == other.mount && year == other.year;
	}

	@Override
	public String toString() {
		return "ExpirationDate [mount=" + mount + ", year=" + year + "]";
	}

	

	
	
	
}
