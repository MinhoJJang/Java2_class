package Exception;

public class Main01 {

	public static void main(String[] args) {
		// 문자열의 숫자 변환에 아무런 문제가 없다.
		String year1 = "1980";
		int age1 = 2021 - Integer.parseInt(year1) + 1;
		System.out.println(age1);
		
		// 숫자로 변환할 수 없으므로, 에러가 발생한다.
		String year2 = "문자열";
		int age2 = 2021 - Integer.parseInt(year2) + 1;
		System.out.println(age2);
		
		// Java프로그램은 예외 상황을 만나면 그 즉시 실행을 중단하고
		// 강제 종료된다. 때문에 이 프로그램의 맨 마지막에 출력하려는
		// 메시지는 표시되지 않는다.
		System.out.println("------------프로그램을 종료합니다.----------");
		
		
		
		
		
	}

}









