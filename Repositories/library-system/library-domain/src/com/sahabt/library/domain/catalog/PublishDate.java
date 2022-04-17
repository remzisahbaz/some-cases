package com.sahabt.library.domain.catalog;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class PublishDate {

	private int day;
	private int mounth;
	private int year;
	

	public static PublishDate of (int day,int mounth,int year) {
		return new PublishDate(day,mounth,year);
	}


	private PublishDate(int day, int mounth, int year) {
		super();
		this.day = day;
		this.mounth = mounth;
		this.year = year;
	}


	public int getDay() {
		return day;
	}


	public int getMounth() {
		return mounth;
	}


	public int getYear() {
		return year;
	}


	@Override
	public int hashCode() {
		return Objects.hash(day, mounth, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PublishDate other = (PublishDate) obj;
		return day == other.day && mounth == other.mounth && year == other.year;
	}


	@Override
	public String toString() {
		return "PublishDate [day=" + day + ", mounth=" + mounth + ", year=" + year + "]";
	}

	
	
	
	
}
