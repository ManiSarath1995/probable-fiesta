
public class Student {

	private String StudentName; // Variable to store Student names
	private int RollNumber; // Variable to store Student Roll number
	private String [] courses; // Variable to store the list of course that student enrolled in
	
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	
}
