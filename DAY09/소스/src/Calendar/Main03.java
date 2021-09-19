package Calendar;

import java.util.Calendar;

public class Main03 {

	public static void main(String[] args) {
		// 객체를 생성한 시점에 대한 시각을 변수로 내장하고 있다.
		Calendar cal = Calendar.getInstance();
		printDateTime.printDateTime(cal);
		
		// 특정 날짜로 지정
		cal.set(Calendar.YEAR, 2020);
		// 자바는 0부터 월을 관리하기 때문에 5월로 설정한 것
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 5);
		cal.set(Calendar.HOUR_OF_DAY, 15);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 33);
		printDateTime.printDateTime(cal);
		
		// 특정 날짜로 지정
		cal.set(1982, 5, 17);
		printDateTime.printDateTime(cal);
		
		// 특정 날짜로 지정(24시간제만 가능함)
		cal.set(1982, 5, 17, 1, 2, 3);
		printDateTime.printDateTime(cal);
		
		// 날짜만 1일로 변경
		cal.set(Calendar.DAY_OF_MONTH, 1);
		printDateTime.printDateTime(cal);
	}

}





