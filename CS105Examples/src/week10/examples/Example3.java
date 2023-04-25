package week10.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example3 {

	public static void main(String[] args) {
		Date newDate;
		try {
			newDate = convertStringToDate("13.04/2023");
			System.out.println(newDate);
		} catch (ParseException e) {
			System.out.println("Error");
		}

	}

	public static Date convertStringToDate(String dateStr) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = df.parse(dateStr);
		return date;
	}

}
