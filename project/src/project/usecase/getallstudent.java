package project.usecase;

import java.util.List;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.StudentException;
import project.model.Student;
/**
 * 
 * @author Shubham
 *This class represents the usecase of the method getallstudent registered in the system.
 */
public class getallstudent {

	/**
	 * 	
	 * @param args
	 * @see Main method to take required parameter to execute the function. 
	 */
	public static void main(String[] args) {
		
		CourseDao dao=new CourseDaoImpl();
		
		try {
			/**
			 * Here making the function call and printing the output.
			 */
			List<Student>s=dao.getallstudent();
			
			s.forEach(a->System.out.println(a));
			
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
