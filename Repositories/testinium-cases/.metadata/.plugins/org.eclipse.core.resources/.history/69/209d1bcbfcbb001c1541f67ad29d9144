/**
 * 
 */
package com.testinium.response;

import java.util.List;
import java.util.Objects;

import com.testinium.dto.response.ResultsOfExamResponse;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public class getInformantionAllStudentResponse {

	private String SchoolNo;
	private String fullName;
	private List<ResultsOfExamResponse> resultsOfExam;
	/**
	 * 
	 */
	public getInformantionAllStudentResponse() {
	}
	/**
	 * @return the schoolNo
	 */
	public String getSchoolNo() {
		return SchoolNo;
	}
	/**
	 * @param schoolNo the schoolNo to set
	 */
	public void setSchoolNo(String schoolNo) {
		SchoolNo = schoolNo;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the resultsOfExam
	 */
	public List<ResultsOfExamResponse> getResultsOfExam() {
		return resultsOfExam;
	}
	/**
	 * @param resultsOfExam the resultsOfExam to set
	 */
	public void setResultsOfExam(List<ResultsOfExamResponse> resultsOfExam) {
		this.resultsOfExam = resultsOfExam;
	}
	@Override
	public int hashCode() {
		return Objects.hash(SchoolNo, fullName, resultsOfExam);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		getInformantionAllStudentResponse other = (getInformantionAllStudentResponse) obj;
		return Objects.equals(SchoolNo, other.SchoolNo) && Objects.equals(fullName, other.fullName)
				&& Objects.equals(resultsOfExam, other.resultsOfExam);
	}
	@Override
	public String toString() {
		return "getInformantionAllStudentResponse [SchoolNo=" + SchoolNo + ", fullName=" + fullName + ", resultsOfExam="
				+ resultsOfExam + "]";
	}
	
	
}
