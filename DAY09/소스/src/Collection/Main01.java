package Collection;

import java.util.HashMap;

public class Main01 {

	public static void main(String[] args) {
		// �����͸� ������ �迭 ����
		// ���ʸ� -> <���� �̸�(key), ��������(value)>
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		// ������ �߰��� put �޼��� ���
		// -> �ߺ��� ������� �ʴ´�.
		hm.put("kor", 98);
		hm.put("eng", 80);
		hm.put("math", 50);
		
		// ����� ���� ���
		System.out.println("hashmap size() : " + hm.size());
		
		// ������ ������
		System.out.println(hm.get("kor"));
		System.out.println(hm.get("eng"));
		System.out.println(hm.get("math"));
		
		System.out.println("---------------");
		// ��ü�� �ִ� ���̹Ƿ� null ��� ����
		hm.put("math", null);
		
		// ������ ������
		System.out.println(hm.get("kor"));
		System.out.println(hm.get("eng"));
		System.out.println(hm.get("math"));
		
		System.out.println("---------------");
		// ��ü�� �ִ� ���̹Ƿ� null ��� ����
		hm.put("math", 100);
		
		// ������ ������
		System.out.println(hm.get("kor"));
		System.out.println(hm.get("eng"));
		System.out.println(hm.get("math"));
		
	}

}





