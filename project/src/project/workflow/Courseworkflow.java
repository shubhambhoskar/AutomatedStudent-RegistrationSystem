package project.workflow;

import java.util.Scanner;

import project.exception.CourseException;
import project.usecase.Searchaboutacourse;
import project.usecase.Updatefee;
import project.usecase.addacourse;
import project.usecase.addstudenttobatch;
import project.usecase.createabatch;
import project.usecase.deleteacourse;
import project.usecase.getallstudent;
import project.usecase.getallthecoursedetails;
import project.usecase.updateseatsofbatch;
/**
 * 
 * @author Shubham
 *This class represents the method calls by using the numbers from 1 to 9. TO run method of course or admin.
 */
public class Courseworkflow {

	/**
	 * 
	 * @param args
	 * @see Execute the method accordingly of course or admin methods
	 */
	public static void main(String[] args) {
		
		System.out.println("select following option");
		System.out.println("Press 1. Add a course");
		System.out.println("Press 2. Update course fee");
		System.out.println("Press 3. Delete a course");
		System.out.println("Press 4. Search about a course");
		System.out.println("Press 5. Create a batch under a course");
		System.out.println("Press 6. Add student to a batch");
		System.out.println("Press 7. Update seats of a batch");
		System.out.println("Press 8. View all the student");
		System.out.println("Press 9. View all the coursedetails");
		
		Scanner sc= new Scanner(System.in);
		
		int x=sc.nextInt();
		
		if(x==1) {
			addacourse.main(args);
		}else if(x==2) {
			
				try {
					Updatefee.main(args);
				} catch (CourseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}else if(x==3) {
			deleteacourse.main(args);
			
		}else if(x==4) {
			Searchaboutacourse.main(args);
		}else if(x==5) {
			createabatch.main(args);
			
		}else if(x==6) {
			addstudenttobatch.main(args);
			
		}else if(x==7) {
			updateseatsofbatch.main(args);
		}else if(x==8) {
			getallstudent.main(args);
		}else if(x==9) {
				try {
					getallthecoursedetails.main(args);
				} catch (CourseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}else {
			System.out.println("Invlid option");
		}
		
	}
}
