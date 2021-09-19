package Exception;

public class Main05 {

	public static void main(String[] args) {
		// 사용자의 입력값을 가정
		String[] src = {"5", "2", "10", "11"};
		
		// src의 내용들은 숫자로 변환해서 저장할 배열
		int[] arr = new int[3];
		
		try {
			for(int i=0; i<src.length; i++) {
				arr[i] = Integer.parseInt(src[i]);
				System.out.println(src[i]);
			}
		}catch(NumberFormatException e) {
			System.out.println("에러가 발생하였습니다.");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("에러가 발생하였습니다.");
			System.out.println(e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("알수없는 에러가 발생하였습니다.");
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------프로그램을 종료합니다.--------");
		
	}

}





