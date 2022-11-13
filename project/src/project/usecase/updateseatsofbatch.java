package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;

public class updateseatsofbatch {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter batch id :");
		int c= sc.nextInt();
		
		System.out.println("Enter No. of seats to update:");
		int d= sc.nextInt();
		
		CourseDao dao= new CourseDaoImpl();
		
		try {
			dao.updateseatofbatch(c, d);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
