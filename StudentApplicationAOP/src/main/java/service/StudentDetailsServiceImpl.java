package service;

import java.util.List;

import model.Student;
import repository.StudentRepository;

public class StudentDetailsServiceImpl implements StudentDetailsService {
	
	private StudentRepository studentRepository;
	
	public StudentDetailsServiceImpl(){
		
	}	
	
	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllDetails(){
		return studentRepository.getAllDetails();
	}
	
	@Override
	public Student getDetails(int id) {
		return studentRepository.getDetails(id);
	}

}
