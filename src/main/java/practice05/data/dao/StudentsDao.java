package practice05.data.dao;

import practice05.Student;

public interface StudentsDao {
	
	void addStudent(Student student);
	
	Student getStudentById(int id);
	
}
