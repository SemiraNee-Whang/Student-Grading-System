public class StudentGradeSystem {
private String name;
	private int studentID;
	private double grade;
	
	public StudentGradeSystem (String name, int studentID, double grade) {
		this.name = name;
		this.studentID = studentID;
		this.grade = grade;
	}

    public StudentGradeSystem(double grade, String name, int studentID) {
        this.grade = grade;
        this.name = name;
        this.studentID = studentID;
    }
	
	public String getName() {
		return name;
	}
	public int getStudentID () {
		return studentID;
	}
	public double getGrade() {
		return grade;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public void setStudentID (int studentID) {
		this.studentID = studentID;
	}
	public void setGrade (double grade) {
		this.grade = grade;
	}
	
	   public String determinePass() {
	        if (grade >= 50 && grade <= 100) {
	            return "Student Name: " + name + 
	                   "\nStudent ID: " + studentID + 
	                   "\nGrade: " + grade + 
	                   "\nResults: Pass";
	        } else if (grade < 50 && grade >= 0) {
	            return "Student Name: " + name + 
	                   "\nStudent ID: " + studentID + 
	                   "\nGrade: " + grade + 
	                   "\nResults: Fail";
	        } else {
	            return "Invalid grade entered. Please enter a grade between 0 and 100.";
	        }
	    }
}
