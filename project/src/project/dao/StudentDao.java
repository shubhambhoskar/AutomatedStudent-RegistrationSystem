package project.dao;

import java.util.List;

import project.exception.CourseException;
import project.exception.StudentException;
import project.model.Course;
import project.model.Student;

public interface StudentDao {

	public void registerstudent(Student s)throws StudentException;
	
	public void updatestudentdetails(int roll,String name,String address,String email,String password)throws StudentException;

	public List<Course> getallcourse() throws CourseException;

}
