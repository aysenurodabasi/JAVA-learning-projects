package javaoop;

public class PersonManager {
	public void add(Instructor instructor){
		instructor.setFirstname("Ayşenur");
		System.out.println(instructor.getFirstname() + " eğitmen olarak eklendi");
	}
	
	public void add(User user){
		user.setFirstname("Fatma");
		System.out.println(user.getFirstname() + " öğrenci(user) olarak eklendi");
	}
}
