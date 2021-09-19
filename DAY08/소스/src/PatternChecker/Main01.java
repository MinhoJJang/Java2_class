package PatternChecker;

import java.util.regex.Pattern;

public class Main01 {

	public static void main(String[] args) {
		// ȸ�����Խÿ� �Է��� ������ ������ ��������
		String name = "�ڹ��л�";
		String age = "19";
		String email = "user@java.net";
		String phone = "01012345678";
		
		// �ѱ� ���� �˻�
		boolean isKor = Pattern.matches("^[��-����-�R]*$", name);
		
		if(!isKor) {
			System.out.println("�̸��� �ѱ۷� �Է��� �ּ���.");
			// ���൵�� return�� ������ ��� �ߴ�
			return;
		}
		
		// ���������˻�
		boolean isNum = Pattern.matches("^[0-9]*$", age);
		
		if(!isNum) {
			System.out.println("���̴� ���ڷθ� �Է��� �ּ���.");
			return;
		}
		
		// �̸��� �˻�
		boolean isEmail = Pattern.matches(
				"^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$"
				, email);
		
		if(!isEmail) {
			System.out.println("�̸��� ������ ���� �ʽ��ϴ�.");
			return;
		}
		
		// �޴��� ��ȣ ���� �˻�
		boolean isPhone = Pattern.matches(
				"^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", 
				phone);
		
		if(!isPhone) {
			System.out.println("��ȭ��ȣ ������ ���� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("ȸ������ ������ �����մϴ�.");
		
	}

}







