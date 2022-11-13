package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
import project.model.Course;

public class addacourse {

	public static void main(String[] args) {
		
		
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
			System.out.println(dao.addacourse(a));
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
}
