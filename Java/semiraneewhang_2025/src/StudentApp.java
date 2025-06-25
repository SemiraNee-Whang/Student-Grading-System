
import javax.swing.JOptionPane;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = JOptionPane.showInputDialog("Enter your name: ");
		int studentID = Integer.parseInt(JOptionPane.showInputDialog("Enter your student ID: ")) ;
		double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter your grade"));
		
		StudentGradeSystem Student = new StudentGradeSystem (name, studentID, grade);
		
		 JOptionPane.showMessageDialog(null, Student.determinePass());
	

	
}
}