package practice05.data.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import practice05.data.dao.TeachersDao;
import practice05.data.entities.Teacher;

@Repository
public class HibernateTeachersDao implements TeachersDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void addTeacher(Teacher teacher) {
		currentSession().save(teacher);
	}

	public Teacher getTeacherById(int id) {
		return (Teacher) currentSession().get(Teacher.class, id);
	}

	public void saveTeacher(Teacher teacher) {
		currentSession().update(teacher);
	}

	
	
}
