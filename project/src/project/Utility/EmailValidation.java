package project.Utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static boolean validateEmail(String email) {
		Pattern VALID_EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
				Pattern.CASE_INSENSITIVE);
		
		Matcher matcher = VALID_EMAIL_REGEX.matcher(email);
		
		return matcher.find();
	}

}
