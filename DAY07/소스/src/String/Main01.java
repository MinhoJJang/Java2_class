package String;

public class Main01 {

	public static void main(String[] args) {
		// String ��ü�� ���� ���
		String str1 = "�ڹ� Programming";
		String str2 = new String("Java");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("-------------------------");
		
		// 1. ���ڿ��� ���̸� ��ȸ
		int str1_len = str1.length();
		int str2_len = str2.length();
		System.out.println("str1.length() : " + str1.length());
		System.out.println("str2.length() : " + str2.length());
		System.out.println("-------------------------");
		
		// 2. Ư�� ���ڿ��� ó������ ��Ÿ���� ��ġ�� ��ȸ
		int str1_pos = str1.indexOf(" ");
		int str2_pos = str2.indexOf("a");
		System.out.println("str1_pos : " + str1_pos);
		System.out.println("str2_pos : " + str2_pos);
		System.out.println("-------------------------");
		
		// 3. Ư�� ���ڿ��� ��Ÿ���� ������ ��ġ�� ��ȸ
		int str1_last_pos = str1.lastIndexOf(" ");
		int str2_last_pos = str2.lastIndexOf("a");
		System.out.println("str1_last_pos : " + str1_last_pos);
		System.out.println("str2_last_pos : " + str2_last_pos);
		System.out.println("-------------------------");
		
		// 4. A�� B�� �����ϱ�
		String new_str1 = str1.replace(" ", "-");
		String new_str2 = str2.replace("a", "A");
		System.out.println("new_str1 : " + new_str1);
		System.out.println("new_str2 : " + new_str2);
		System.out.println("-------------------------");
		
		// 5. ��ҹ��� ����
		String upper = new_str2.toUpperCase();
		String lower = new_str2.toLowerCase();
		System.out.println("upper : " + upper);
		System.out.println("lower : " + lower);
		System.out.println("-------------------------");
		
		// 6. ���ڿ��� �յ� ���� ����
		String input = "	enjoy java gramming		";
		String output = input.trim();
		System.out.println("input : " + input);
		System.out.println("output : " + output);
		// �߰�������� ������ ��� ���� ����
		String output2 = input.replace(" ", "");
		String output3 = input.replace("\t", "").replace(" ", "");
//		output3 = output3.replace(" ", "");
		System.out.println("output2 : " + output2);
		System.out.println("output3 : " + output3);
		System.out.println("-------------------------");
		
		// 7. ���ڿ� ���ϱ�
		boolean isSame = str1.equals(str2);
		if( isSame ) {
			System.out.println("����!");
		} else {
			System.out.println("�ٸ���!");
		}
		System.out.println("-------------------------");
		
		// 8. ���ڿ��� �ڸ���
		// ù ��° �Ķ���� : ���� ��ġ
		// �� ��° �Ķ���� : �� ��ġ
		String sub_str1 = str1.substring(0, 2);			// �ڹ�
		System.out.println("sub_str1 : " + sub_str1);
		// �� ��° �Ķ���Ͱ� ���� ��� ������ �ڸ���.
		String sub_str2 = str1.substring(3);
		System.out.println("sub_str2 : " + sub_str2);
		System.out.println("-------------------------");
		
		// 9. ���Ŀ� ���� ���ڿ� ����� ���� Static �޼��� ���
		/*
		 *  - %d 	: ����
		 *  - %s	: ����
		 *  - %f	: float�� �Ҽ�
		 *  - %3d	: ���ڸ� 3�ڸ��� ���缭 ���
		 *  		  �ڸ����� ���� ������, �տ� ���� ���
		 *  - %03d	: �ڸ����� ���� ������ 0�� ���
		 *  - %3s	: ���ڿ��� 3�ڸ��� ���缭 ���
		 *  		 �ڸ����� ���� ������ �տ� ���� ���
		 *  		(%03s�� ���� ������ ��� �Ұ�)
		 */
		
		int yy = 2021;
		int mm = 8;
		int dd = 4;
		String gender = "����";
		String result = String.format("%d�� %02d�� %02d�� %s", 
										yy, mm, dd, gender);
		System.out.println(result);
		System.out.println("--------------------");
		
		// 10. �־��� ���ڸ� �������� �߶󳻾 �迭�� ��ȯ
		String src = "C++/Java/C#/JavaScript/VB";
		String[] data = src.split("/");
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
	}

}











