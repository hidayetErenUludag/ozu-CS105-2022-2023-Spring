package week10.examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
//		String name=null;
//		System.out.println(name.toUpperCase());
		Date newDate=convertStringToDate("13/04/2023");
		System.out.println(newDate);
	}
	
	public static Date convertStringToDate(String dateStr) {
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		Date date;
		try {
			
			date = df.parse(dateStr);
			String a=null;
			System.out.println(a.toUpperCase());
		}
		catch (ParseException e) {
			System.out.println("Date format is wrong!!");
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			date=null;
		}catch (Exception e) {
			System.out.println("EXCEPTION"+e.getMessage()+" "+e.getClass().getTypeName());
			date=null;
		} 
		finally {
			System.out.println("hello");
		}
		return date;
	}

}
