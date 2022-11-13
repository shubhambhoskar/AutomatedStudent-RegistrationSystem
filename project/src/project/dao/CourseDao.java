package project.dao;

import java.util.List;

import project.exception.CourseException;
import project.exception.StudentException;
import project.model.Batch;
import project.model.Course;
import project.model.Student;

public interface CourseDao {

	
	public String addacourse(Course a) throws CourseException;
	
	public void updatefee(int cid,int fee)throws CourseException;
	
	public void deletecourse(String s)throws CourseException;
	
	public void SearchInfoAboutCourse( String s) throws CourseException;
	
	public String createabatch(Batch batch) throws CourseException;
	
	public String addstudenttobatchincourse(int roll,int bid, int cid)throws CourseException;
	
	public void updateseatofbatch(int bid, int updateseat)throws CourseException;
	
	public List<Student> getallstudent() throws StudentException;
	
	public List<Course> getallcourse() throws CourseException;
}
