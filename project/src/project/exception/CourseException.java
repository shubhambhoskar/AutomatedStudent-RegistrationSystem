package project.exception;
/**
 * 
 * @author Shubham
 *These class gives the proper message if any method throws the Course exception . Accordingly it will give message.
 */
public class CourseException extends Exception{

	
	public CourseException() {
		
	}
	
	public CourseException(String msg) {
		super(msg);
	}
}
