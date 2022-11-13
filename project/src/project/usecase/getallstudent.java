package project.usecase;

import java.util.List;

import project.dao.CourseDao;
import project.dao.CourseDaoImpl;
import project.exception.StudentException;
import project.model.Student;

public class getallstudent {

	
	public static void main(String[] args) {
		
		
		CourseDao dao=new CourseDaoImpl();
		
		try {
			List<Student>s=dao.getallstudent();
			
			s.forEach(a->System.out.println(a));
			
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
