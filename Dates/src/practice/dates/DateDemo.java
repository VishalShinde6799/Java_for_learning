package practice.dates;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1 = LocalDate.now();
		LocalTime t1 = LocalTime.now();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss:ns");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MMM/yyyy  HH:mm:ss:ns");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("E, dd/MM/yyyy  HH:mm:ss");
		LocalDateTime dt1 = LocalDateTime.now();
		String FormattedDate = dt1.format(format1);
		String FormattedDate2 = dt1.format(format2);
		String FormattedDate3 = dt1.format(format3);
		//String s2 = t1.format(format1);
		System.out.println(t1);
		System.out.println(d1);
		System.out.println(FormattedDate);
		System.out.println(FormattedDate2);
		String date = FormattedDate3.substring(0, 15);
		System.out.println("Date: "+date);
		System.out.println("Time: "+FormattedDate3.substring(date.length(), FormattedDate3.length()));
	
	}

}
