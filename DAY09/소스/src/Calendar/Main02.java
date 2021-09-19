package Calendar;

import java.util.Calendar;

public class Main02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDateTime.printDateTime(cal);
		
		// 지금으로 부터 100일 후
		cal.add(Calendar.DAY_OF_MONTH, 100);
		printDateTime.printDateTime(cal);
		
		// 75년 전
		cal.add(Calendar.YEAR, -75);
		printDateTime.printDateTime(cal);
		
		// 9시간 후
		cal.add(Calendar.HOUR, 9);
		printDateTime.printDateTime(cal);
		
//		cal = Calendar.getInstance();
//		printDateTime.printDateTime(cal);
		
		// 8달 후
		cal.add(Calendar.MONTH, 8);
		printDateTime.printDateTime(cal);
	}

}









