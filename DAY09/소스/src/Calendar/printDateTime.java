package Calendar;

import java.util.Calendar;

public class printDateTime {
	
	// Ķ���� Ŭ������ �Ķ���ͷ� ���޹޾�, �� ��ü�� �����ϰ� �ִ�
	// �ð��� ����ϴ� �޼���
	public static void printDateTime( Calendar cal ) {
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		
		System.out.printf("%04d�� %02d�� %02d�� %02d�� %02d�� %02d��\n"
				, yy, mm, dd, hh, mi, ss);
	}
	
}



