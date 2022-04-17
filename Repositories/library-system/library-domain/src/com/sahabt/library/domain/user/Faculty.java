package com.sahabt.library.domain.user;

import java.util.Objects;

import com.sahabt.library.domain.annotations.ValueObject;

@ValueObject
public final class Faculty {

	private String facultyName;
	private int foundationYear;
	public static Faculty of (String facultyName,int foundationYear) {
		return new Faculty(facultyName,foundationYear);
	}
	private Faculty(String facultyName, int foundationYear) {
		super();
		this.facultyName = facultyName;
		this.foundationYear = foundationYear;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public int getFoundationYear() {
		return foundationYear;
	}
	@Override
	public int hashCode() {
		return Objects.hash(facultyName, foundationYear);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		return Objects.equals(facultyName, other.facultyName) && foundationYear == other.foundationYear;
	}
	@Override
	public String toString() {
		return "Faculty [facultyName=" + facultyName + ", foundationYear=" + foundationYear + "]";
	} 
	
	
}
