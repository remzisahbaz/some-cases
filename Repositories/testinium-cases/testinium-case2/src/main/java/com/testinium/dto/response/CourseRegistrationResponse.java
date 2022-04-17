/**
 * 
 */
package com.testinium.dto.response;

import com.testinium.entity.Course;
import com.testinium.entity.ResultsOfExam;
import com.testinium.entity.Student;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Data
@Builder

public class CourseRegistrationResponse {

	private Long id;
	private String yearCode;
	private boolean state;
	private Student student;
	private ResultsOfExam resultsOfExam;
	private Course course;
}
