package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
/**
 * 
 * @author Shubham
 *This is the usecase of the method delete course
 */
public class deleteacourse {

	/**
	 * 	
	 * @param args
	 * @see Main method to take required parameter to execute the function. 
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course name :");
		String n= sc.next();
		
		CourseDao d= new CourseDaoImpl();
		
		try {
			/**
			 * Here, it is taking batch name and make the function call. 
			 */
			d.deletecourse(n);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Course not deleted");
		}
		
	}
	
}
