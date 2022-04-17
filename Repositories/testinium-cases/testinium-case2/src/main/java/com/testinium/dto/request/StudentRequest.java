/**
 * 
 */
package com.testinium.dto.request;

import lombok.Builder;
import lombok.Data;

/**
 * @author Remzi ŞAHBAZ
 *
 */
@Data
@Builder
public class StudentRequest {

	private String schoolNo;
	private String fullName;

}
