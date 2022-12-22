package project.workflow;

import java.util.Scanner;

/**
 * 
 * @author Shubham
 *This is the main class of the application how the workflow happens
 */
public class Main {

	/**
	 * 	
	 * @param args
	 * @see Main method to execute the application. 
	 */
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Welcome to Student Registration System");
			System.out.println("-------------------------------------");
			
			System.out.println("Press the button according to category");
			System.out.println("Press 1. Administrator");
			System.out.println("Press 2. Student");
			System.out.println("Press 3. To Exit");
			
			Scanner sc= new Scanner(System.in);
			int opt=sc.nextInt();
			
			if(opt==1) {
				System.out.println("Welcome to the admin section");
				System.out.println("----------------------------");
				System.out.println("Please login to access");
				System.out.println("Enter username");
				String username=sc.next();
				
				System.out.println("Enter Password");
				String password=sc.next();
				
				
				if(username.equals("admin") && password.equals("123")) {
				
				Courseworkflow.main(args);
	
				}else {
					System.out.println("Not logged in...");
				}
			
			
		}else if(opt==2) {
			System.out.println("Welcome to Student system");
			System.out.println("-------------------------");
			
			StudentWorkflow.main(args);
			
			
		}else if(opt==3) {
			System.out.println("Thank you for visiting");
		}else {
			System.out.println("Invalid options");
		}
		
		
	  }
			
	}

}
