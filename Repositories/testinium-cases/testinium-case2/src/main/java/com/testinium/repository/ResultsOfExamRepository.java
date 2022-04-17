/**
 * 
 */
package com.testinium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testinium.entity.ResultsOfExam;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Repository
public interface ResultsOfExamRepository extends JpaRepository<ResultsOfExam, Long> {

}
