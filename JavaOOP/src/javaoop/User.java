package javaoop;

public class User extends Person {
	private int userNumber;
	private String courses;
	
	public User() {
		
	}

	public User(int userNumber,String courses) {
		this.userNumber = userNumber;
		this.courses = courses;
	}
	
	public int getUsernumber() {
		return userNumber;
	}
	
	public void setUsernumber(int number) {
		this.userNumber = number;
	}
	
	public String getCourses() {
		return courses;
	}
	
	public void setCourses(String course) {
		this.courses = course;
	}
}
