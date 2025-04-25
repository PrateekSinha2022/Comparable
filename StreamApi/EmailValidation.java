package StreamApi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
		
		String email="shubhranil420@gmail.com";
		String regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		
		if(matcher.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}

}
