package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
/**
 * 
 * @author Shubham
 *This class indicates the add student to the batch in a particular course by taking roll, batch id ,course id.
 */
public class addstudenttobatch {

	/**
	 * 	
	 * @param args
	 * @see Main function method to take required parameter to execute the function. 
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		
		System.out.println("Enter roll no :");
		int c= sc.nextInt();
		
		System.out.println("Enter batch id :");
		int b= sc.nextInt();
		
		System.out.println("Enter course id :");
		int n= sc.nextInt();
		
		CourseDao dao=new CourseDaoImpl();
		
		try {
			/**
			 * Taking input from the admin to add a student to batch.
			 * Make the function call gives the output.
			 */
			System.out.println(dao.addstudenttobatchincourse(c, b, n));
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
}
