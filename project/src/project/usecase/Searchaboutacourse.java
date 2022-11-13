package project.usecase;

import java.util.Scanner;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;

public class Searchaboutacourse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter course name :");
		String n= sc.next();
		
		CourseDao dao= new CourseDaoImpl();
	
		
		try {
			dao.SearchInfoAboutCourse(n);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Not found course");
		}
	}
}
