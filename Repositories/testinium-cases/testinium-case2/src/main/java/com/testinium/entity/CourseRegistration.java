/**
 * 
 */
package com.testinium.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Entity
@Table(name = "course_registration")

public class CourseRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String yearCode;
	private boolean state;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnore
	private Student student;

//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "ResultsOfExam_CourseRegistration",
//			joinColumns = { @JoinColumn(name = "course_registration_Id") },
//			inverseJoinColumns = { @JoinColumn(name = "ResultsOfExam_Id")
//			})
//	@JoinColumn(name = "ResultsOfExam_Id")
	
	@ManyToMany
	 @JoinTable(
		        name = "coursereg_result",
		        joinColumns = @JoinColumn(name="coursereg_id", referencedColumnName = 
		        "id"),
		        inverseJoinColumns = @JoinColumn(name = "result_id", 
		        referencedColumnName = "id"))
	private Set<ResultsOfExam> resultsOfExam =new HashSet<>() ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseCode")
	private Course course;

	/**
	 * 
	 */
	public CourseRegistration() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the resultsOfExam
	 */
	public Set<ResultsOfExam> getResultsOfExam() {
		return resultsOfExam;
	}

	/**
	 * @param resultsOfExam the resultsOfExam to set
	 */
	public void setResultsOfExam(Set<ResultsOfExam> resultsOfExam) {
		this.resultsOfExam = resultsOfExam;
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

	@Override
	public int hashCode() {
		return Objects.hash(id, student, yearCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseRegistration other = (CourseRegistration) obj;
		return Objects.equals(id, other.id) && Objects.equals(student, other.student)
				&& Objects.equals(yearCode, other.yearCode);
	}

	@Override
	public String toString() {
		return "CourseRegistration [id=" + id + ", yearCode=" + yearCode + ", state=" + state + ", student=" + student
				+ ", resultsOfExam=" + resultsOfExam + ", course=" + course + "]";
	}

}
