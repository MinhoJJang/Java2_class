package Exception;

public class Main04 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try {
			for(int i = 0; i<5; i++) {
				arr[i] = i;	// i�� 3�϶� ���� �߻�
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�����߻�");
			System.out.println("���� : " + e.getMessage());
		}
		
		System.out.println("---------���α׷��� �����մϴ�.-----------");
		
	}

}

















