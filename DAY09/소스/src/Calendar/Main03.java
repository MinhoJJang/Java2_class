package Calendar;

import java.util.Calendar;

public class Main03 {

	public static void main(String[] args) {
		// ��ü�� ������ ������ ���� �ð��� ������ �����ϰ� �ִ�.
		Calendar cal = Calendar.getInstance();
		printDateTime.printDateTime(cal);
		
		// Ư�� ��¥�� ����
		cal.set(Calendar.YEAR, 2020);
		// �ڹٴ� 0���� ���� �����ϱ� ������ 5���� ������ ��
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 5);
		cal.set(Calendar.HOUR_OF_DAY, 15);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 33);
		printDateTime.printDateTime(cal);
		
		// Ư�� ��¥�� ����
		cal.set(1982, 5, 17);
		printDateTime.printDateTime(cal);
		
		// Ư�� ��¥�� ����(24�ð����� ������)
		cal.set(1982, 5, 17, 1, 2, 3);
		printDateTime.printDateTime(cal);
		
		// ��¥�� 1�Ϸ� ����
		cal.set(Calendar.DAY_OF_MONTH, 1);
		printDateTime.printDateTime(cal);
	}

}





