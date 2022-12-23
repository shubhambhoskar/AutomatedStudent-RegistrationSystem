package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
import project.model.Batch;
/**
 * 
 * @author Shubham
 *This is the class used to indicate the method create batch by taking parameters and making the function call.
 */
public class createabatch {

	/**
	 * 	
	 * @param args
	 * @see Main method to take required parameter to execute the function. 
	 */
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter batch id :");
		int c= sc.nextInt();
		
		System.out.println("Enter batch name :");
		String b= sc.next();
		
		System.out.println("Enter batch duration :");
		int d= sc.nextInt();
		
		System.out.println("Enter course id :");
		int cid= sc.nextInt();
	
		System.out.println("Enter seats of batch :");
		int seats= sc.nextInt();
		
		Batch batch=new Batch(c,b,d,seats,cid);
		
		CourseDao dao=new CourseDaoImpl();
		
		
		try {
			/**
			 * Take the needed input to make the function call.
			 * It will gives the output accordingly.
			 */
			System.out.println(dao.createabatch(batch));
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
