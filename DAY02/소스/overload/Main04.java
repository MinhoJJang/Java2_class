package overload;

public class Main04 {

	public static void main(String[] args) {
		Article a1 = new Article(1);
		System.out.println( a1.toString() );
		
		Article a2 = new Article(2, "�׽�Ʈ �Խù�");
		System.out.println( a2.toString() );
		
		Article a3 = new Article(3, "�ι�° �׽�Ʈ �Խù�", "�ڹ��л�");
		System.out.println( a3.toString() );
	}

}
