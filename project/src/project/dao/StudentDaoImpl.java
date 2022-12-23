package project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import project.Utility.DButil;
import project.exception.CourseException;
import project.exception.StudentException;
import project.model.Course;
import project.model.Student;

/**
 * 
 * @author Shubham
 *@see The class StudentDaoImpl to perform the student methods.
 */
public class StudentDaoImpl implements StudentDao{

	/**
	 * @param  s It will take the student object.
	 * @throws StudentException
	 * @see This is the function to add a student to the system .
	 */
	@Override
	public void registerstudent(Student s) throws StudentException {
			
			try(Connection conn=DButil.provideConnection()){
				
				PreparedStatement ps=conn.prepareStatement("insert into student(name,address,email,password)values(?,?,?,?)");
				
				ps.setString(1, s.getName());
				ps.setString(2, s.getAddress());
				ps.setString(3, s.getEmail());
				ps.setString(4, s.getPassword());
				
				int x=ps.executeUpdate();
				
				if(x>0) {
					System.out.println(x+" student registerd Successfully");
				}else {
					System.out.println("Not registered");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Not Registerd");
			}
	}

	/**
	 * @param  It will take parameter to update 
	 * @throws StudentException
	 * @see This is the function to update a student record from the system .
	 */
	@Override
	public void updatestudentdetails(int roll, String name, String address, String email, String password)
			throws StudentException {
		
		try(Connection conn=DButil.provideConnection()) {
			
			PreparedStatement ps=conn.prepareStatement("update student set name=?,address=?,email=?,password=? where roll=?");
		
			ps.setString(1,name);
			ps.setString(2,address);
			ps.setString(3,email);
			ps.setString(4,password);
			ps.setInt(5, roll);
			
			int x=ps.executeUpdate();
		
			if(x>0) {
				System.out.println(x+" Student details are update");
			}else {
				System.out.println("No record found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Student not found..");
		}
		
	}

	/**
     * @return List of course
     * @throws CourseException
     * @see This function retuns the list of all the courses present in the system.
     */
	@Override
	public List<Course> getallcourse() throws CourseException {
List<Course> courses = new ArrayList<>();
		
		try(Connection conn = DButil.provideConnection()){
			
			PreparedStatement ps =  conn.prepareStatement("select * from course");
		
			ResultSet rs = ps.executeQuery();
			
			boolean flag = true;
			
			while(rs.next()) {
				
				flag = false;
				int roll = rs.getInt("cid");
				String name = rs.getString("cname");
				int fee = rs.getInt("fee");
				String dur = rs.getString("duration");
				
				//Course courses = new Student(roll,name,address,email,pass);
				Course c=new Course(roll, name, fee, dur);
				courses.add(c);
			}
			
			if(flag) throw new CourseException("Course not found");
			
			
		}catch (SQLException e) {
			// TODO: handle exception
			throw new CourseException(e.getMessage());
		}
		
		return courses;
	}

}
