package tdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	public static int add(String numbersString) {
		int resultado = 0;
		String pattern = "//(.)\\n(.*)";
		Pattern regex = Pattern.compile(pattern);
		Matcher matcher = regex.matcher(numbersString);
		
		String delimiter;
		
		if (matcher.find()) {
			System.out.println("matcher find");
			delimiter = matcher.group(1);
			numbersString = matcher.group(2);
		} else {
			System.out.println("matcher not find");
			delimiter = ",";
		}
		
		if (! "".equals(numbersString)) {
			for (String number : numbersString.split(delimiter + "|\n")) {
				resultado+= Integer.parseInt(number);
			}
		}
		
		return resultado;
		
	}


}
