package Math;

/*
 * java.lang.Math  클래스
 * -----------------------
 * 수학과 관련된 메서드들을 갖고 있는 클래스
 * 모든 메서드들이 static 형태이기 때문에, 객체를 생성할 필요는 없다.
 */
public class Main01 {

	public static void main(String[] args) {
		// 주어진 두 수에 대한 최대값 구하기
		int max = Math.max(100, 9999);
		System.out.println("최대값 : " + max);
		
		// 주어진 두 수에 대한 최소값 구하기
		int min = Math.min(100, 9999);
		System.out.println("최소값 : " + min);
		
		// 주어진 수에 대한 절대값 구하기
		int abs = Math.abs(-234);
		System.out.println("절대값 : " + abs);
		 
		// 소수점 반올림
		long num = Math.round(3.12456);
		System.out.println("소수점 반올림 : " + num);
		
		// 지수, 로그, 제곱근
		System.out.println("log(5) : " + Math.log(5));
		System.out.println("루트5 : " + Math.sqrt(5));
		System.out.println("2의 5승 : " + Math.pow(2, 5));

		// random()
		/*
		 * 랜덤값 생성하기
		 * Math.random() 메서드는 0~1 범위를 갖는 double 형의 값을 리턴한다.
		 */
		System.out.println("random1 : " + Math.random());
		System.out.println("random2 : " + Math.random());
		System.out.println("random3 : " + Math.random());
		
		
	}

}














