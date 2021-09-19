package Math;

/*
 * java.lang.Math  Ŭ����
 * -----------------------
 * ���а� ���õ� �޼������ ���� �ִ� Ŭ����
 * ��� �޼������ static �����̱� ������, ��ü�� ������ �ʿ�� ����.
 */
public class Main01 {

	public static void main(String[] args) {
		// �־��� �� ���� ���� �ִ밪 ���ϱ�
		int max = Math.max(100, 9999);
		System.out.println("�ִ밪 : " + max);
		
		// �־��� �� ���� ���� �ּҰ� ���ϱ�
		int min = Math.min(100, 9999);
		System.out.println("�ּҰ� : " + min);
		
		// �־��� ���� ���� ���밪 ���ϱ�
		int abs = Math.abs(-234);
		System.out.println("���밪 : " + abs);
		 
		// �Ҽ��� �ݿø�
		long num = Math.round(3.12456);
		System.out.println("�Ҽ��� �ݿø� : " + num);
		
		// ����, �α�, ������
		System.out.println("log(5) : " + Math.log(5));
		System.out.println("��Ʈ5 : " + Math.sqrt(5));
		System.out.println("2�� 5�� : " + Math.pow(2, 5));

		// random()
		/*
		 * ������ �����ϱ�
		 * Math.random() �޼���� 0~1 ������ ���� double ���� ���� �����Ѵ�.
		 */
		System.out.println("random1 : " + Math.random());
		System.out.println("random2 : " + Math.random());
		System.out.println("random3 : " + Math.random());
		
		
	}

}














