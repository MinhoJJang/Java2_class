package File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Main02 {

	public static void main(String[] args) {
		// ������ ������ ���
		final String PATH = "K:/java2_1900_kjh/day10/test.txt";
		
		// ���Ͽ� ������ ����
		String write_string = "�����ٶ󸶹ٻ�abcdefgtestteststetsetasdfasdrf";
		
		// ���Ͽ� ������ ���� ���ؼ� ������ ������ byte �迭�� ��ȯ�Ѵ�.
		// Ư�� ���ڵ� ��� ����
		byte[] buffer = null;
		try {
			buffer = write_string.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// ��ȯ�� �迭�� OutputStream�� write()�޼��忡�� �Ķ���ͷ� ����
		// ���� ������ ���� FileOutputStream�� ����� ���Ͽ� ����
		// ��θ� ������ �Ķ���ͷ� �����ؾ� �ϰ�, 
		// �θ� ���·� �Ϲ��� ����ȯ ó�� �Ѵ�.
		// ���� ���� ���� ����
		
		// finally ��Ͽ��� �ν��ϱ� ���ؼ� ����θ� ���� �̵�
		OutputStream out = null;
		try {
			out = new FileOutputStream(PATH);
			// ���� ����
			out.write(buffer);
			System.out.println("[INFO] ���� ���� ���� >> " + PATH);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ������ ��θ� ã�� �� ����. " + PATH);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ���� " + PATH);
			e.printStackTrace();
		} catch (Exception e){
			System.out.println("[ERROR] �� �� ���� ���� >> " + PATH);
			e.printStackTrace();
		} finally {
			// OutputStream ��ü�� close() �޼��� ȣ���Ͽ� ��Ʈ���� �ݴ´�. 
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}






