package practice05;

public class Student {

	private int studentId;
	private String pib;
	private int course;
	
	public Student(){}
	
	public Student(String pib, int course){
		this.setPib(pib);
		this.setCourse(course);
	}
	
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getPib() {
		return pib;
	}

	public void setPib(String pib) {
		this.pib = pib;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
	
	public String toString() {
		return "[Student: id=" + this.studentId + ", pib=" + this.pib + ", course=" + this.course + "]";
	}
	
}
