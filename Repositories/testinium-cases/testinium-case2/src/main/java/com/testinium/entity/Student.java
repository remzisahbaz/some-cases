/**
 * 
 */
package com.testinium.entity;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Entity
@Table(name = "students")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {

	@Id
	private String schoolNo;
	private String fullName;
	@OneToMany(fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<CourseRegistration> courseRegistration;
	/**
	 * 
	 */
	public Student() {
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
	 * @return the courseRegistration
	 */
	public Set<CourseRegistration> getCourseRegistration() {
		return courseRegistration;
	}
	/**
	 * @param courseRegistration the courseRegistration to set
	 */
	public void setCourseRegistration(Set<CourseRegistration> courseRegistration) {
		this.courseRegistration = courseRegistration;
	}
	@Override
	public int hashCode() {
		return Objects.hash(schoolNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(schoolNo, other.schoolNo);
	}
	@Override
	public String toString() {
		return "Student [schoolNo=" + schoolNo + ", fullName=" + fullName + ", courseRegistration=" + courseRegistration
				+ "]";
	}
	
	
}
