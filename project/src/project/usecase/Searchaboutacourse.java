package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
/**
 * 
 * @author Shubham
 *This class used as usecase of searchaboutacourse method.
 */
public class Searchaboutacourse {

	/**
	 * 	
	 * @param args
	 * @see Main method to take required parameter to execute the function. 
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course name :");
		String n= sc.next();
		
		CourseDao dao= new CourseDaoImpl();
	
		
		try {
			/**
			 * Here is the method call.
			 */
			dao.SearchInfoAboutCourse(n);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not found course");
		}
	}
}
