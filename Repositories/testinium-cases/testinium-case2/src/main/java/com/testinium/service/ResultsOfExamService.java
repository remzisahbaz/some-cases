/**
 * 
 */
package com.testinium.service;

import java.util.Optional;

import com.testinium.dto.request.ResultsOfExamRequest;
import com.testinium.dto.response.ResultsOfExamResponse;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public interface ResultsOfExamService {

	Optional<ResultsOfExamResponse> createResultsOfExam(ResultsOfExamRequest courseRegistration);

}
