package Calendar;

import java.util.Calendar;

public class Main02 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		printDateTime.printDateTime(cal);
		
		// �������� ���� 100�� ��
		cal.add(Calendar.DAY_OF_MONTH, 100);
		printDateTime.printDateTime(cal);
		
		// 75�� ��
		cal.add(Calendar.YEAR, -75);
		printDateTime.printDateTime(cal);
		
		// 9�ð� ��
		cal.add(Calendar.HOUR, 9);
		printDateTime.printDateTime(cal);
		
//		cal = Calendar.getInstance();
//		printDateTime.printDateTime(cal);
		
		// 8�� ��
		cal.add(Calendar.MONTH, 8);
		printDateTime.printDateTime(cal);
	}

}









