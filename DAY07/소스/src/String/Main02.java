package String;

public class Main02 {

	public static void main(String[] args) {
		// 이메일 주소에서 아이디와 도메인을 구별하기
		// 이메일 주소 정의
		// split() 사용금지
		// 아이디 : student
		// 도메인 : java.com
		// 12분까지
		String email = "student@java.com";
		
		// 1. "@"가 나타나는 위치 얻기
		int s = email.indexOf("@");
		
		// 2. 처음부터 "@"가 나타나는 위치까지 자르기 -> 아이디
		String email_id = email.substring(0, s);
		
		// 3. "@"가 나타나는 위치 다음부터 끝까지 자르기 -> 도메인
		String email_domain = email.substring(s + 1);
		
		System.out.println(email_id);
		System.out.println(email_domain);
	}

}



















