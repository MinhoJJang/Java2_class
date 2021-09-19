package Static;

public class Main01 {

	public static void main(String[] args) {
		Article.setCategory("자유게시판");
		
		Article a1 = new Article(1, "첫 번째 글 제목", "2021-08-22");
		Article a2 = new Article(2, "두 번째 글 제목", "2021-08-23");
		Article a3 = new Article(3, "세 번째 글 제목", "2021-08-23");
		
		
		System.out.println( a1.toString() );
		System.out.println( a2.toString() );
		System.out.println( a3.toString() );
		
		System.out.println("--------------------------------------");
		
		// static 변수의 값을 변경하면, 모든 객체가 영향을 받는다.
		Article.setCategory("공지사항");
		
		System.out.println( a1.toString() );
		System.out.println( a2.toString() );
		System.out.println( a3.toString() );
		
		
	}

}








