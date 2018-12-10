package model;

import java.util.*;

public class StudentRegister {
	private ArrayList<Student> students = new ArrayList<Student>();

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void addStudents(Student s) {
		if (this.findStudents(s.getStudentID()) == null)
			students.add(s);
	}

	public Student findStudents(String s) {
		for (Student tmp : students) {
			if (tmp.getStudentID().equals(s))
				return tmp;
		}
		return null;
	}

	public Student deleteStudents(Student student) {
		Student tmp = this.findStudents(student.getStudentID());
		students.remove(tmp);
		return tmp;
	}

}
