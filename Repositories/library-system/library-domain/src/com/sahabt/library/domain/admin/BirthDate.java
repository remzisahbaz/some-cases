package com.sahabt.library.domain.admin;

import java.util.Date;
import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class BirthDate {
	private int day;
	private int mount;
	private int year;

	public static BirthDate of(int day, int mount, int year) {
		return new BirthDate(day,mount,year);

	}
	

	private BirthDate(int day, int mount, int year) {
		super();
		this.day = day;
		this.mount = mount;
		this.year = year;
	}


	public int getDay() {
		return day;
	}

	public int getMount() {
		return mount;
	}

	public int getYear() {
		return year;
	}


	@Override
	public int hashCode() {
		return Objects.hash(day, mount, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BirthDate other = (BirthDate) obj;
		return day == other.day && mount == other.mount && year == other.year;
	}


	@Override
	public String toString() {
		return "BirthDate [day=" + day + ", mount=" + mount + ", year=" + year + "]";
	}


}
