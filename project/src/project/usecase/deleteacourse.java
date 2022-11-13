package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;

public class deleteacourse {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course name :");
		String n= sc.next();
		
		CourseDao d= new CourseDaoImpl();
		
		try {
			d.deletecourse(n);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Course not deleted");
		}
		
	}
	
}
