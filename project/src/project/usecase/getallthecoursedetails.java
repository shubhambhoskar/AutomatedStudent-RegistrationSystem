package project.usecase;

import java.util.List;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
import project.model.Course;

/**
 * 
 * @author Shubham
 *This is the usecase class of the methods getallcourse.
 *
 */
public class getallthecoursedetails {

	/**
	 * 
	 * @param args
	 * @throws CourseException
	 * @see This method gives us all details of the course. 
	 */
public static void main(String[] args) throws CourseException {
		
		
		CourseDao dao=new CourseDaoImpl();
		
		try {
			List<Course>s=dao.getallcourse();
		
			s.forEach(a->System.out.println(a));
		
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new CourseException(e.getMessage());
		}
		
		
	}
}
