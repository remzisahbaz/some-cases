/**
 * 
 */
package com.testinium.dto.response;

import java.util.Objects;

import com.testinium.entity.Course;
import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */

public class ResultsOfExamResponse {

	private Course course;
	private Student student;
	private Double firstExamResult;
	private Double secondExamResult;
	private Double avarage;
	private boolean stateOfResult;

	/**
	 * 
	 */
	public ResultsOfExamResponse() {
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
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
	 * @return the firstExamResult
	 */
	public Double getFirstExamResult() {
		return firstExamResult;
	}

	/**
	 * @param firstExamResult the firstExamResult to set
	 */
	public void setFirstExamResult(Double firstExamResult) {
		this.firstExamResult = firstExamResult;
	}

	/**
	 * @return the secondExamResult
	 */
	public Double getSecondExamResult() {
		return secondExamResult;
	}

	/**
	 * @param secondExamResult the secondExamResult to set
	 */
	public void setSecondExamResult(Double secondExamResult) {
		this.secondExamResult = secondExamResult;
	}

	/**
	 * @return the avarage
	 */
	public Double getAvarage() {
		return avarage;
	}

	/**
	 * @param avarage the avarage to set
	 */
	public void setAvarage(Double avarage) {
		this.avarage = avarage;
	}

	/**
	 * @return the stateOfResult
	 */
	public boolean isStateOfResult() {
		return stateOfResult;
	}

	/**
	 * @param stateOfResult the stateOfResult to set
	 */
	public void setStateOfResult(boolean stateOfResult) {
		this.stateOfResult = stateOfResult;
	}

	@Override
	public String toString() {
		return "ResultsOfExamResponse "
				+ "student=" + student
			//	+ "[" + "course=" + course + ", " 
				+ 
				", " + "firstExamResult="
				+ firstExamResult + ", secondExamResult=" + secondExamResult + ", avarage=" + avarage
				+ ", stateOfResult=" + stateOfResult + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, student);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultsOfExamResponse other = (ResultsOfExamResponse) obj;
		return Objects.equals(course, other.course) && Objects.equals(student, other.student);
	}

}
