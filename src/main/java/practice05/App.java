package practice05;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practice05.data.entities.Teacher;
import practice05.worker.WorkWithStudents;
import practice05.worker.WorkWithTeachers;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		WorkWithStudents worker = (WorkWithStudents) context.getBean("worker");
		//new WorkWithStudents();
		Student testStudent = new Student("Vlad Valt", 5);
		worker.saveStudentToDb(testStudent);
		
		
		WorkWithTeachers workWithTeachers = (WorkWithTeachers) context.getBean("teachersWorker");
		Teacher teacher = new Teacher();
		teacher.setFirstname("Andrii");
		teacher.setLastname("Glybovets");
		teacher.setCellphone("+380675097865");
		teacher = workWithTeachers.addTeacher(teacher);
		teacher.setBirthDate(new Date(5, 5, 5));
		workWithTeachers.saveTeacher(teacher);
		
	}
	
}