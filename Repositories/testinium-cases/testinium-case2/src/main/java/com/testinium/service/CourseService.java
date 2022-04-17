/**
 * 
 */
package com.testinium.service;

import java.util.Optional;

import com.testinium.entity.Course;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface CourseService {

	Optional<Course> createCourse(Course course);

}
