package model;

public class Test {

	public static void main(String[] args) {

		StudentRegister reg = new StudentRegister();

		Student s1 = new Student("S100", "Kalle");
		Student s2 = new Student("S200", "Oskar");
		Student s3 = new Student("S300", "Vilma");
		Student s4 = new Student("S400", "Mats");

		System.out.println(s1.getStudentID());
		System.out.println(s2.getStudentID());

		reg.addStudents(s1);
		reg.addStudents(s2);
		reg.addStudents(s3);
		reg.addStudents(s4);

		System.out.println();
		
		for (Student s : reg.getStudents()) {
			System.out.println(s.getName());
		}

		System.out.println();
		System.out.println(reg.deleteStudents(s4).getName());
		
		System.out.println();

		for (Student s : reg.getStudents()) {
			System.out.println(s.getName());
		}

		System.out.println();
		System.out.println(reg.findStudents("S100").getName());
		
		
	}
}
