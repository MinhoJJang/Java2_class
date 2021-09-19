package Calendar;

import java.util.Calendar;

public class Main04 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		// ���Ͽ� �ش��ϴ� �ε���(��=1 ~ ��=7)
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("���� �ε��� : " + day);
		
		// ������ ����ϱ�
		String[] day_name = {"��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println("���� = " + day_name[day-1]);
		
		// �̹� ���� �� �ַ� �Ǿ� �ִ°�?
		int week_count = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		System.out.println("�̹� ���� " + week_count + "�ַ� �Ǿ� �ִ�.");
		
		// �̹� ���� �� �ϱ��� �ִ°�?
		int day_count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("�̹� ���� " + day_count + "�� ���� �ִ�.");
	
		// �̹� ���� ���� ���Ϻ��� �����ϴ°�?
		cal.set(Calendar.DAY_OF_MONTH, 1);
		int first_day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("�̹� ���� ���� ���� �ε��� : " + first_day);
		System.out.println("�̹� ���� ���� ���� : " + day_name[first_day-1]);
		
	}

}





