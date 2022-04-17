/**
 * 
 */
package com.testinium.dto.response;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public class InformationStudentResponse {

	private Student student;
	private Set<String> gradeName= new HashSet<>();
	private Set<Double> gradAvarage=new HashSet<>();;

	
	/**
	 * 
	 */
	public InformationStudentResponse() {
	}
	
	
	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}


	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}


	/**
	 * @return the gradeName
	 */
	public Set<String> getGradeName() {
		return gradeName;
	}


	/**
	 * @param gradeName the gradeName to set
	 */
	public void setGradeName(Set<String> gradeName) {
		this.gradeName = gradeName;
	}


	/**
	 * @return the gradAvarage
	 */
	public Set<Double> getGradAvarage() {
		return gradAvarage;
	}


	/**
	 * @param gradAvarage the gradAvarage to set
	 */
	public void setGradAvarage(Set<Double> gradAvarage) {
		this.gradAvarage = gradAvarage;
	}


	@Override
	public int hashCode() {
		return Objects.hash(gradeName, student);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InformationStudentResponse other = (InformationStudentResponse) obj;
		return Objects.equals(gradeName, other.gradeName) && Objects.equals(student, other.student);
	}
	@Override
	public String toString() {
		return "AllStudentResponse [student=" + student + ", gradeName=" + gradeName + ", gradAvarage=" + gradAvarage
				+ "]";
	}
	
	 
}
