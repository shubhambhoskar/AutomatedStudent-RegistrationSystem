package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;

public class addstudenttobatch {

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
			System.out.println(dao.addstudenttobatchincourse(c, b, n));
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	
}
