package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Main02 {

	public static void main(String[] args) {
		// 저장할 파일의 경로
		final String PATH = "K:/java2_1900_kjh/day10/test.txt";
		
		// 파일에 저장할 내용
		String write_string = "가나다라마바사abcdefgtestteststetsetasdfasdrf";
		
		// 파일에 내용을 쓰기 위해선 저장할 내용을 byte 배열로 변환한다.
		// 특정 인코딩 방식 적용
		byte[] buffer = null;
		try {
			buffer = write_string.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// 변환된 배열을 OutputStream의 write()메서드에게 파라미터로 전달
		// 파일 저장을 위한 FileOutputStream은 저장될 파일에 대한
		// 경로를 생성자 파라미터로 설정해야 하고, 
		// 부모 형태로 암묵적 형변환 처리 한다.
		// 파일 저장 절차 시작
		
		// finally 블록에서 인식하기 위해서 선언부를 위로 이동
		OutputStream out = null;
		try {
			out = new FileOutputStream(PATH);
			// 파일 쓰기
			out.write(buffer);
			System.out.println("[INFO] 파일 저장 성공 >> " + PATH);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 지정된 경로를 찾을 수 없음. " + PATH);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 파일 저장 실패 " + PATH);
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("[ERROR] 알 수 없는 에러 >> " + PATH);
			e.printStackTrace();
		} finally {
			// OutputStream 객체로 close() 메서드 호출하여 스트림을 닫는다. 
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}






