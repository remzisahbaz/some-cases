/**
 * 
 */
package com.testinium.dto.request;

import java.util.Objects;

import com.testinium.entity.Course;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */

public class ResultsOfExamRequest {
	
	private String  yearCode;
	private String schoolNo;
	private String courseCode;

	private Double firstExamResult;
	private Double secondExamResult;
	private Double avarage;
	private boolean stateOfResult;
	/**
	 * 
	 */
	public ResultsOfExamRequest() {
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
	public int hashCode() {
		return Objects.hash(courseCode, schoolNo, yearCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResultsOfExamRequest other = (ResultsOfExamRequest) obj;
		return Objects.equals(courseCode, other.courseCode) && Objects.equals(schoolNo, other.schoolNo)
				&& Objects.equals(yearCode, other.yearCode);
	}
	@Override
	public String toString() {
		return "ResultsOfExamRequest [yearCode=" + yearCode + ", schoolNo=" + schoolNo + ", courseCode=" + courseCode
				+ ", firstExamResult=" + firstExamResult + ", secondExamResult=" + secondExamResult + ", avarage="
				+ avarage + ", stateOfResult=" + stateOfResult + "]";
	}
	
	
	
	
	
}
