package Calendar;

import java.util.Calendar;

public class Main05 {

	public static void main(String[] args) {
		// � ó���� ���� ���� �ð��� ��´�.
		Calendar cal = Calendar.getInstance();
		// ���� �ð��� ���� TimeStamp�� �и������� ������ ���
		long m1 = cal.getTimeInMillis();
		System.out.println("���� ���� �ð� >> " + m1);
		
		// ���α׷��� �־��� �ð����� ����ϵ��� �ϴ� ó��
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// ó���� ���� ���� �ð� ���. Ÿ�ӽ������� ��� �Ǵٸ� ���
		long m2 = System.currentTimeMillis();
		System.out.println("���Ϻ��� �� >> " + m2);
		
		// �� �ð��� ���� ���
		long x = m2 - m1;
		System.out.println(x);
		
		// 1/1000�� �̹Ƿ�, 1000���� ������ �ҿ� �ð��� ���� �� ����
		long y = x/1000;
		System.out.println(y + "�� ������");
		
		
	}

}














