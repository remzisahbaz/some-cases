/**
 * 
 */
package com.testinium.dto.response;

import java.util.Objects;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */

public class StudentResponse {

	private String schoolNo;
	private String fullName;

	/**
	 * @param schoolNo
	 * @param fullName
	 */
	public StudentResponse(String schoolNo, String fullName) {
		this.schoolNo = schoolNo;
		this.fullName = fullName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fullName, schoolNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentResponse other = (StudentResponse) obj;
		return Objects.equals(fullName, other.fullName) && Objects.equals(schoolNo, other.schoolNo);
	}

	@Override
	public String toString() {
		return "StudentResponse [schoolNo=" + schoolNo + ", fullName=" + fullName + "]";
	}

	
}
