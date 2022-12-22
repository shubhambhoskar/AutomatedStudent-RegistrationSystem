package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
import project.model.Course;
/**
 * 
 * @author Shubham
 *This class is the usecase of the addcourse methods
 */
public class addacourse {
	/**
	 * 	
	 * @param args
	 * @see Main method to take required parameter to execute the function. 
	 */
	public static void main(String[] args) {
		/**
		 * Here, Taking the details to execute the methods (By passing parameter to method call). 
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter course id :");
		int c= sc.nextInt();
		
		System.out.println("Enter course name :");
		String n= sc.next();
		
		System.out.println("Enter course fee :");
		int f= sc.nextInt();
		
		System.out.println("Enter course duration :");
		String d= sc.next();
		
		Course a= new Course(c, n, f, d);
		
		CourseDao dao= new CourseDaoImpl();
		
		try {
			/**
			 * Make the function call and gives the output.
			 */
			System.out.println(dao.addacourse(a));
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
}
