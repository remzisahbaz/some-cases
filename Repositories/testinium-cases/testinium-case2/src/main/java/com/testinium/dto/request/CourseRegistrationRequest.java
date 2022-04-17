/**
 * 
 */
package com.testinium.dto.request;

import java.util.Objects;

import com.testinium.entity.Course;
import com.testinium.entity.ResultsOfExam;
import com.testinium.entity.Student;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */

public class CourseRegistrationRequest {


	private String yearCode;
	private String courseCode;
	private boolean state;
	private String schoolNo;
	private Long resultsofexamId;
	/**
	 * 
	 */
	public CourseRegistrationRequest() {
	}
	/**
	 * @return the yearCode
	 */
	public String getYearCode() {
		return yearCode;
	}
	/**
	 * @param yearCode the yearCode to set
	 */
	public void setYearCode(String yearCode) {
		this.yearCode = yearCode;
	}
	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}
	/**
	 * @return the schoolNo
	 */
	public String getSchoolNo() {
		return schoolNo;
	}
	/**
	 * @param schoolNo the schoolNo to set
	 */
	public void setSchoolNo(String schoolNo) {
		this.schoolNo = schoolNo;
	}
	/**
	 * @return the resultsofexamId
	 */
	public Long getResultsofexam_id() {
		return resultsofexamId;
	}
	/**
	 * @param resultsofexamId the resultsofexamId to set
	 */
	public void setResultsofexam_id(Long resultsofexam_id) {
		this.resultsofexamId = resultsofexam_id;
	}
	/**
	 * @return the courseCode
	 */
	public String getCourseCode() {
		return courseCode;
	}
	/**
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(courseCode, resultsofexamId, yearCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseRegistrationRequest other = (CourseRegistrationRequest) obj;
		return Objects.equals(courseCode, other.courseCode) && Objects.equals(resultsofexamId, other.resultsofexamId)
				&& Objects.equals(yearCode, other.yearCode);
	}
	@Override
	public String toString() {
		return "CourseRegistrationRequest [yearCode=" + yearCode + ", state=" + state + ", schoolNo=" + schoolNo
				+ ", resultsofexamId=" + resultsofexamId + ", courseCode=" + courseCode + "]";
	}
	
	
}
