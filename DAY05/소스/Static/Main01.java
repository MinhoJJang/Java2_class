package Static;

public class Main01 {

	public static void main(String[] args) {
		Article.setCategory("�����Խ���");
		
		Article a1 = new Article(1, "ù ��° �� ����", "2021-08-22");
		Article a2 = new Article(2, "�� ��° �� ����", "2021-08-23");
		Article a3 = new Article(3, "�� ��° �� ����", "2021-08-23");
		
		
		System.out.println( a1.toString() );
		System.out.println( a2.toString() );
		System.out.println( a3.toString() );
		
		System.out.println("--------------------------------------");
		
		// static ������ ���� �����ϸ�, ��� ��ü�� ������ �޴´�.
		Article.setCategory("��������");
		
		System.out.println( a1.toString() );
		System.out.println( a2.toString() );
		System.out.println( a3.toString() );
		
		
	}

}








