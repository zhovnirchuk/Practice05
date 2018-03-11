package practice05.data.dao;

import practice05.data.entities.Teacher;

public interface TeachersDao {

	void addTeacher(Teacher teacher);
	
	Teacher getTeacherById(int id);
	
	void saveTeacher(Teacher teacher);
	
}
