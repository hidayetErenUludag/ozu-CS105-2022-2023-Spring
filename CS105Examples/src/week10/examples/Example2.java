package week10.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example2 {

	public static void main(String[] args) {
		//main>method1>method2>convertStringToDate(parseexception)
		Date newDate=new Date();
		newDate = method1("13.04/2023");
		System.out.println(newDate);
	}

	public static Date method1(String dateStr)  {
		try {
			return method2(dateStr);
		} catch (ParseException e) {
			return new Date();
		}
	}
	private static Date method2(String dateStr) throws ParseException {
		return convertStringToDate(dateStr);
	}

	public static Date convertStringToDate(String dateStr) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = df.parse(dateStr);
		return date;
	}
}
