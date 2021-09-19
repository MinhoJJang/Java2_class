package Calendar;

import java.util.Calendar;

// java.util.Calendar
public class Main01 {

	public static void main(String[] args) {
		// Ķ���� ��ü�� ���� -> �̱��� ��ü
		Calendar cal = Calendar.getInstance();
		
		// ��,��,��,��,��,�� >> 24�ð���
		int yy = cal.get(Calendar.YEAR);
		// �ڹٿ����� ���� 0���� ���۵ȴ�.
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		
		System.out.printf("%04d�� %02d�� %02d�� %02d�� %02d�� %02d��\n"
				, yy, mm, dd, hh, mi, ss);
		System.out.println("---------------------------------");
		
		// ��,��,��,��,��,�� >> 12�ð���
		yy = cal.get(Calendar.YEAR);
		mm = cal.get(Calendar.MONTH) + 1;
		dd = cal.get(Calendar.DAY_OF_MONTH);
		hh = cal.get(Calendar.HOUR);
		mi = cal.get(Calendar.MINUTE);
		ss = cal.get(Calendar.SECOND);
		
		// ����(=0), ����(=1)
		int ampm = cal.get(Calendar.AM_PM);
		//System.out.println(ampm);
		String[] apname = {"����", "����"};
		
		System.out.printf("%04d�� %02d�� %02d�� %s %02d�� %02d�� %02d��\n"
				, yy, mm, dd, apname[ampm],hh, mi, ss);
		System.out.println("---------------------------------");
		
		
		
		
		
		
		
		
		
	}

}









