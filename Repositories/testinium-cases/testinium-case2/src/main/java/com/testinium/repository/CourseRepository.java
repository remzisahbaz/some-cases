/**
 * 
 */
package com.testinium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testinium.entity.Course;
import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Repository
public interface CourseRepository extends JpaRepository<Course,String>{

}
