package javaoop;

public class Main {

	public static void main(String[] args) {
		PersonManager pm = new PersonManager();
		pm.add(new Instructor());
		pm.add(new User());
		
		System.out.println("-----------------");
		
		Instructor instructor= new Instructor();
		instructor.setLessons("Java");
		instructor.setLessonDetail("Object Oriented Programlama - Soyutlama");
		System.out.println(instructor.getLessons());
		System.out.println(instructor.getLessonDetail());
		
		System.out.println("-----------------");
		
		User student = new User();
		student.setUsernumber(123);
		student.setCourses("React.js, Java, OOP courses");
		student.setPassword("sifre123");
		System.out.println(student.getUsernumber());
		System.out.println(student.getCourses());
		System.out.println(student.getPassword());
	}
}
