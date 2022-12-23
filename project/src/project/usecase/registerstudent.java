package project.usecase;

import java.util.Scanner;

import project.Utility.EmailValidation;
import project.dao.StudentDao;
import project.dao.StudentDaoImpl;
import project.exception.StudentException;
import project.model.Student;
/**
 * 
 * @author Shubham
 *This is the used as a usecase of registerstudent method.
 */
public class registerstudent {

	/**
	 * 	
	 * @param args
	 * @see Main method to take required parameter to execute the function. 
	 */
	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter student name :");
		String n= sc.next();
		
		System.out.println("Enter student address :");
		String a= sc.next();
		
		System.out.println("Enter student email :");
		String e= sc.next();
		
		if(!EmailValidation.validateEmail(e)) {
		System.out.println("Invalid email");
		return;
		}
		
		System.out.println("Enter student password :");
		String p= sc.next();
		
		Student s= new Student();
		s.setName(n);
		s.setAddress(a);
		s.setEmail(e);
		s.setPassword(p);
		
		StudentDao dao=new StudentDaoImpl();
		
		try {
			/**
			 * Here is the method call.
			 */
			dao.registerstudent(s);
		} catch (StudentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
}
