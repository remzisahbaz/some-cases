package com.testinium.service.business;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testinium.dto.request.CourseRegistrationRequest;
import com.testinium.dto.request.ResultsOfExamRequest;
import com.testinium.dto.response.InformationStudentResponse;
import com.testinium.dto.response.ResultsOfExamResponse;
import com.testinium.entity.Course;
import com.testinium.entity.CourseRegistration;
import com.testinium.entity.ResultsOfExam;
import com.testinium.entity.Student;
import com.testinium.repository.CourseRegistrationRepository;
import com.testinium.repository.CourseRepository;
import com.testinium.repository.ResultsOfExamRepository;
import com.testinium.repository.StudentRepository;
import com.testinium.response.getInformantionAllStudentResponse;
import com.testinium.service.CourseRegistrationService;
import com.testinium.service.CourseService;
import com.testinium.service.ResultsOfExamService;
import com.testinium.service.StudentService;

@Service
public class StandartServiceBusiness
		implements StudentService, ResultsOfExamService, CourseService, CourseRegistrationService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRegistrationRepository courseRegistrationRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private ResultsOfExamRepository resultsOfExamRepository;

	@Autowired
	private ModelMapper modelMapper;

	/**
	 * @param studentRepository
	 * @param courseRegistrationRepository
	 * @param courseRepository
	 * @param resultsOfExamRepository
	 * @param modelMapper
	 */
	public StandartServiceBusiness(StudentRepository studentRepository,
			CourseRegistrationRepository courseRegistrationRepository, CourseRepository courseRepository,
			ResultsOfExamRepository resultsOfExamRepository, ModelMapper modelMapper) {
		this.studentRepository = studentRepository;
		this.courseRegistrationRepository = courseRegistrationRepository;
		this.courseRepository = courseRepository;
		this.resultsOfExamRepository = resultsOfExamRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public Optional<Student> createStudent(Student student) {

		var exist = studentRepository.existsById(student.getSchoolNo());
		if (!exist) {

			return Optional.of(studentRepository.save(student));
		}

		return Optional.ofNullable(null);
	}

	@Override
	public Optional<CourseRegistration> createCourseRegistration(CourseRegistrationRequest courseRegistration) {

		var newcoursereg = new CourseRegistration();
		var student = studentRepository.findById(courseRegistration.getSchoolNo());

		if (!student.isEmpty()) {
			newcoursereg.setStudent(student.get());
			var course = courseRepository.findById(courseRegistration.getCourseCode());

			if (!course.isEmpty()) {
				newcoursereg.setCourse(course.get());
				// var resultsOfExam =
				// resultExRep.findById(courseRegistration.getResultsofexam_id());

				newcoursereg.setYearCode(courseRegistration.getYearCode());
				newcoursereg.setState(courseRegistration.isState());

				System.out.println("**********" + newcoursereg.getId());
				System.out.println(newcoursereg.toString());

				return Optional.of(courseRegistrationRepository.save(newcoursereg));

			}
		}

		return Optional.ofNullable(null);
	}

	@Override
	public Optional<Course> createCourse(Course course) {
		var exist = courseRepository.existsById(course.getCourseCode());
		if (!exist) {

			return Optional.of(courseRepository.save(course));
		}

		return Optional.ofNullable(null);
	}

	@Override
	public Optional<ResultsOfExamResponse> createResultsOfExam(ResultsOfExamRequest request) {

		// find student by SchoolNo
		var existStudent = studentRepository.findById(request.getSchoolNo());
		if (!existStudent.isEmpty()) {

			// find Course by CourseCode
			var existCourse = courseRepository.findById(request.getCourseCode());
			if (!existCourse.isEmpty()) {

				// request->converter->result
				var resultOf = modelMapper.map(request, ResultsOfExam.class);

				// set course , set courser regis.
				resultOf.setCourse(existCourse.get());
				// find course registration by course_registration_id

				var findCourseRegistration = courseRegistrationRepository.findByStudentAndCourseAndYearCode(
						existStudent.get(), existCourse.get(), request.getYearCode());
				
				System.out.println("before save------------------servis busines" + findCourseRegistration);
			
				
				resultOf.setCourseRegistration(findCourseRegistration.get());

				
				// save new resultsOfExam
				var saveResults = resultsOfExamRepository.save(resultOf);

				System.out.println("after save------------------servis busines");
				// resultof->converter->response
				var resultResponse = modelMapper.map(saveResults, ResultsOfExamResponse.class);

				resultResponse.setStudent(existStudent.get());
				return Optional.of(resultResponse);

			}

		}

		return Optional.ofNullable(null);
	}

	@Override
	public Optional<InformationStudentResponse> getStudentBySchoolYearAndCourseCodeAndSchoolNo(String schoolNo,
			String courseCode, String year) {

		// find student by SchoolNo
		var existStudent = studentRepository.findById(schoolNo);
		if (!existStudent.isEmpty()) {

			// find Course by CourseCode
			var existCourse = courseRepository.findById(courseCode);
			if (!existCourse.isEmpty()) {

				var existCourseRegisration = courseRegistrationRepository
						.findByStudentAndCourseAndYearCode(existStudent.get(), existCourse.get(), year);

				System.out.println("***------**-*-*--"+existCourseRegisration.get());

				return Optional.of(modelMapper.map(existCourseRegisration.get(), InformationStudentResponse.class));

			}
		}

		return Optional.ofNullable(null);
	}

	@Override
	public Optional<getInformantionAllStudentResponse> getAllStudentAvarageAndResultsOfExam(String courseCode,
			String year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<String> createAnyCourseAnyStudent(String courseCode, String schoolNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
