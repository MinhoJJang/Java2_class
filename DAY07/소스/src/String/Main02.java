package String;

public class Main02 {

	public static void main(String[] args) {
		// �̸��� �ּҿ��� ���̵�� �������� �����ϱ�
		// �̸��� �ּ� ����
		// split() ������
		// ���̵� : student
		// ������ : java.com
		// 12�б���
		String email = "student@java.com";
		
		// 1. "@"�� ��Ÿ���� ��ġ ���
		int s = email.indexOf("@");
		
		// 2. ó������ "@"�� ��Ÿ���� ��ġ���� �ڸ��� -> ���̵�
		String email_id = email.substring(0, s);
		
		// 3. "@"�� ��Ÿ���� ��ġ �������� ������ �ڸ��� -> ������
		String email_domain = email.substring(s + 1);
		
		System.out.println(email_id);
		System.out.println(email_domain);
	}

}



















