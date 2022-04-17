/**
 * 
 */
package com.testinium.service;

import java.util.Optional;

import com.testinium.entity.Student;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface StudentService {

	Optional<Student> createStudent(Student student);

}
