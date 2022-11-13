package project.usecase;

import java.util.List;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.CourseException;
import project.model.Course;

public class getallcourseinstudent {

	public static void main(String[] args)  {
		
		CourseDao dao=new CourseDaoImpl();
		
		try {
			List<Course>s=dao.getallcourse();
		
			s.forEach(a->System.out.println(a));
		
		} catch (CourseException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
		
	}
}
