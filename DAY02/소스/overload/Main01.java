package overload;

public class Main01 {

	public static void main(String[] args) {
		Character c = new Character();
		System.out.println( c.toString() );
		
		c.setProperty(19);
		System.out.println(c.toString());
		
		c.setProperty("ȸ���");
		System.out.println( c.toString() );
		
		c.setProperty("�ڿ���", 33);
		System.out.println( c.toString() );
		
		c.setProperty(50, "����");
		System.out.println( c.toString() );
		
	}

}
