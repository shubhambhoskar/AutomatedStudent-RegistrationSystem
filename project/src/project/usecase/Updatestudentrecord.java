package project.usecase;

import java.util.Scanner;

import project.dao.StudentDao;
import project.dao.StudentDaoImpl;
import project.exception.StudentException;

public class Updatestudentrecord {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter student roll no.");
		int roll=sc.nextInt();
		
		System.out.println("Enter student name to update:");
		String n= sc.next();
		
		System.out.println("Enter student address to update:");
		String a= sc.next();
		
		System.out.println("Enter student email to update:");
		String e= sc.next();
		
		System.out.println("Enter student password to update:");
		String p= sc.next();
		
		StudentDao dao=new StudentDaoImpl();
		
		try {
			dao.updatestudentdetails(roll, n, a, e, p);
		} catch (StudentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
