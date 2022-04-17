/**
 * 
 */
package com.testinium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testinium.entity.Student;

/**
 * @author sahabt
 *
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,String>{

}
