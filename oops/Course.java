package oops;

public class Course {
	private String courseId;
	private String courseName;
	private int durationInWeeks;
	private double feea;
	public void checkduration() {
		if(getDurationInWeeks()>12)
		{
			System.out.println("Duration is greater than 12 weeks");
		}
		else {
			System.out.println("Duration is less than 12 weeks");
		}
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getDurationInWeeks() {
		return durationInWeeks;
	}
	public void setDurationInWeeks(int durationInWeeks) {
		this.durationInWeeks = durationInWeeks;
	}
	public double getFeea() {
		return feea;
	}
	public void setFeea(double feea) {
		this.feea = feea;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", durationInWeeks=" + durationInWeeks
				+ ", feea=" + feea + "]";
	}
	public Course(String courseId, String courseName, int durationInWeeks, double feea) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.durationInWeeks = durationInWeeks;
		this.feea = feea;
	}
	public Course() {
		super();
	}

}
