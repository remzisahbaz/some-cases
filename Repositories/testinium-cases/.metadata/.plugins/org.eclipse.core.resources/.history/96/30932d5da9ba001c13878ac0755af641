/**
 * 
 */
package com.testinium.repository;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testinium.entity.Course;
import com.testinium.entity.CourseRegistration;
import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Repository
public interface CourseRegistrationRepository extends JpaRepository<CourseRegistration, Long> {




	Optional<Set<CourseRegistration>> findByStudentAndCourseAndYearCode(Student student, Course course, String yearCode);

}


