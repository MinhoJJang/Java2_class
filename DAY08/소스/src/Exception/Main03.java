package Exception;

// try ~ catch ������� ����ó���� ����� ��쿡��,
// ������ �߻��Ǵ��� ���α׷� ��ü�� �ٿ���� �ʴ´�.
public class Main03 {

	public static void main(String[] args) {
		
		try {
			String year2 = "���ڿ�";
			int age2 = 2021 - Integer.parseInt(year2) + 1;
			System.out.println(age2);
		} catch(NumberFormatException e) {
			System.out.println("������ �߻��߽��ϴ�.");
			System.out.println("���� : " + e.getMessage());
		}
		
		System.out.println("------------���α׷��� �����մϴ�.----------");
		
	}

}
