package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
/**
 * 
 * @author Shubham
 *THis is usecase of the method updatefee and contains the method call.
 */
public class Updatefee {

	/**
	 * 	
	 * @param args
	 * @see Main method to take required parameter to execute the function. 
	 */
	public static void main(String[] args) throws CourseException {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter course id to update fee :");
		int c= sc.nextInt();
		
		System.out.println("Enter the fee amount");
		int f= sc.nextInt();
		
		CourseDao d= new CourseDaoImpl();
		
		try {
			/**
			 * Here is the method call using input parameter.
			 */
			d.updatefee(c, f);
		} catch (CourseException e) {
			
			e.printStackTrace();
			throw new CourseException(e.getMessage());
		}
	}
}
