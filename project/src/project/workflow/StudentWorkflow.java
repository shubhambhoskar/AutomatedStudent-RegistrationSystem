package project.workflow;

import java.util.Scanner;

import project.usecase.Updatestudentrecord;
import project.usecase.getallcourseinstudent;
import project.usecase.registerstudent;

public class StudentWorkflow {

	public static void main(String[] args) {
		
		System.out.println("Please select the option");
		System.out.println("Press 1. To register yourself");
		System.out.println("Press 2. TO update details");
		System.out.println("Press 3. Gell all the course");
		
		Scanner sc= new Scanner(System.in);
		int opt=sc.nextInt();
		
		if(opt==1) {
			registerstudent.main(args);
		}else if(opt==2) {
			Updatestudentrecord.main(args);
		}else if(opt==3) {
			getallcourseinstudent.main(args);
		}else {
			System.out.println("Invalid option");
		}
		
	}
}
