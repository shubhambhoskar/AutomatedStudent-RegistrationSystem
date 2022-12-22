package project.usecase;

import java.util.List;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
import project.model.Course;
/**
 * 
 * @author Shubham
 *This class is the usecase of the method to get all Course list.
 */
public class getallcourseinstudent {

	/**
	 * 	
	 * @param args
	 * @see Main method to take required parameter to execute the function. 
	 */
	public static void main(String[] args)  {
		
		CourseDao dao=new CourseDaoImpl();
		
		try {
			/**
			 * Make the function call and return the list.
			 * Then list is printed using foreach loop.
			 */
			List<Course>s=dao.getallcourse();
		
			s.forEach(a->System.out.println(a));
		
		} catch (CourseException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
		
	}
}
