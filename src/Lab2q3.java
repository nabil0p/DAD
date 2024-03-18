import java.util.Scanner;

public class Lab2q3 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	     System.out.println("How many marks do you want to insert?");
	     int numOfMarks = scanner.nextInt(); // Read the number of marks from the user
	        
	     double totalMark = 0;

	     for (int i = 1; i <= numOfMarks; i++) {
	         System.out.println("Please enter mark no " + i);
	         double mark = scanner.nextDouble(); // Read the mark input from the user
	         totalMark += mark;
	         System.out.println("Mark: " + mark + " has been inserted");
	     }
	     
	     System.out.println("Total mark is: " + totalMark);

	     scanner.close(); // Close the Scanner object to prevent resource leak
	}

}
