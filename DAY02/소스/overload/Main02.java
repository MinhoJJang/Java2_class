package overload;

public class Main02 {

	public static void main(String[] args) {
		foo(100);
		foo(100l);
	}
	
	public static void foo( int a ) {
		System.out.println("int Ÿ��");
	}
	
	public static void foo( long a ) {
		System.out.println("long Ÿ��");
	}
	

}
