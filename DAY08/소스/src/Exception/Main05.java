package Exception;

public class Main05 {

	public static void main(String[] args) {
		// ������� �Է°��� ����
		String[] src = {"5", "2", "10", "11"};
		
		// src�� ������� ���ڷ� ��ȯ�ؼ� ������ �迭
		int[] arr = new int[3];
		
		try {
			for(int i=0; i<src.length; i++) {
				arr[i] = Integer.parseInt(src[i]);
				System.out.println(src[i]);
			}
		}catch(NumberFormatException e) {
			System.out.println("������ �߻��Ͽ����ϴ�.");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("������ �߻��Ͽ����ϴ�.");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("�˼����� ������ �߻��Ͽ����ϴ�.");
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------���α׷��� �����մϴ�.--------");
		
	}

}





