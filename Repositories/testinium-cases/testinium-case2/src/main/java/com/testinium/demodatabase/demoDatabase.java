/**
 * 
 */
package com.testinium.demodatabase;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.testinium.entity.Student;
import com.testinium.repository.StudentRepository;
import com.testinium.service.business.StandartServiceBusiness;

/**
 * @author Remzi ŞAHBAZ
 *
 */
public class demoDatabase {

	private StandartServiceBusiness servis;

	public void students() {

		Map<Long, Student> list = new HashMap<>();
		var s = new Student();
		s.setSchoolNo("A1001");
		s.setFullName("Remzi ŞAHBAZ");
		servis.createStudent(s);

		s.setSchoolNo("A1002");
		s.setFullName("Elif ŞAHBAZ");

		servis.createStudent(s);
		s.setSchoolNo("A1003");
		s.setFullName("Beyza ŞAHBAZ");

		servis.createStudent(s);
		list.put(1L, s);

		

	}
}
