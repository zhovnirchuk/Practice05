package practice05.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import practice05.data.dao.TeachersDao;
import practice05.data.entities.Teacher;

@Transactional
public class WorkWithTeachers {
	
	@Autowired
	private TeachersDao teachersDao;
	
	public Teacher addTeacher(Teacher teacher) {
		teachersDao.addTeacher(teacher);
		System.out.println("Teacher has been added " + teacher);
		return teacher;
	}
	
	public Teacher getTeacherById(int id) {
		return teachersDao.getTeacherById(id);
	}
	
	public void saveTeacher(Teacher teacher) {
		teachersDao.saveTeacher(teacher);
		System.out.println("Teacher has been saved " + teacher);
	}

}
