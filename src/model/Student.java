package model;

import java.util.*;

public class Student {
	private String studentID, name;
	private ArrayList<WrittenExam> exams = new ArrayList<WrittenExam>();

	public Student(String studentID) {
		this.studentID = studentID;
	}

	public Student(String studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	public Student() {

	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o == this)
			return true;
		if (!(o instanceof Student))
			return false;

		Student student = (Student) o;

		return Objects.equals(studentID, student.studentID);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		// if (this.studentID == null && !this.studentID.equals(studentID))
		this.studentID = studentID;
	}

	public ArrayList<WrittenExam> getExams() {
		return exams;
	}

	public void setExams(ArrayList<WrittenExam> exams) {
		this.exams = exams;
	}
}