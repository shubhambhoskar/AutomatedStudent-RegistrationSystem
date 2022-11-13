package project.usecase;

import java.util.List;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
import project.model.Course;


public class getallthecoursedetails {

	
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
