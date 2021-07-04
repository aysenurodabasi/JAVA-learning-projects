package javaoop;

public class Instructor extends Person {
	private String lessons;
	private String lessonDetail;
	
	public Instructor() {
		
	}
	
	public Instructor(String lessons, String lessonDetail) {
		this.lessons = lessons;
		this.lessonDetail = lessonDetail;
	}
	
	public String getLessons() {
		return lessons;
	}
	
	public void setLessons(String lesson) {
		this.lessons = lesson;
	}
	
	public String getLessonDetail() {
		return lessonDetail;
	}
	
	public void setLessonDetail(String detail) {
		this.lessonDetail = detail;
	}
	
}
