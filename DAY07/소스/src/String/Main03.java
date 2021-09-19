package String;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * �ֹε�Ϲ�ȣ���� ��������� �����ϱ�
		 * ex) 8005011234567	-> 1980�� 05�� 01�� ����
		 * �¾ �⵵ : gender�� �ش��ϴ� ���� 1 or 2�϶� -> 19 ~
		 * 			  �� �� -> 20 ~ 
		 * ���� ���� : gender�� �ش��ϴ� ���� 1 or 3�϶� -> ����
		 * 			�� �� -> ����
		 */
		String jumin = "8005011234567";
		
		// �ֹι�ȣ�� ��,��,�� ������ �� ���ھ� �ڸ���
		String yy = jumin.substring(0,2);
		String mm = jumin.substring(2,4);
		String dd = jumin.substring(4,6);
		
		// �� �κ��� ù ��° ��¥�� �����ڵ��̹Ƿ� ������ ����
		String gender_code = jumin.substring(6,7);
		
		// �¾ �⵵�� �Ǻ�
		if( gender_code.equals("1") || gender_code.equals("2") ) {
			yy = "19" + yy;
		} else {
			yy = "20" + yy;
		}
		
		// �⺻ ������ ����
		String gender = "����";
		// �� �κ� ù ���ڰ� 2,4�� ��� ����
		if( gender_code.equals("2") || gender_code.equals("4") ) {
			gender = "����";
		}
	
		// ���Ŀ� ���� ���� ���
		// (String.format + System.out.println = System.out.printf )
		System.out.printf("%s�� %s�� %s�� %s", yy, mm, dd, gender);
		
		
	}

}



















