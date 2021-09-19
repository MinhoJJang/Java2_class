package Collection;

import java.util.HashMap;

public class Main01 {

	public static void main(String[] args) {
		// 데이터를 저장할 배열 생성
		// 제너릭 -> <값의 이름(key), 값의종류(value)>
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		// 데이터 추가는 put 메서드 사용
		// -> 중복을 허용하지 않는다.
		hm.put("kor", 98);
		hm.put("eng", 80);
		hm.put("math", 50);
		
		// 저장된 갯수 얻기
		System.out.println("hashmap size() : " + hm.size());
		
		// 데이터 꺼내기
		System.out.println(hm.get("kor"));
		System.out.println(hm.get("eng"));
		System.out.println(hm.get("math"));
		
		System.out.println("---------------");
		// 객체를 넣는 것이므로 null 사용 가능
		hm.put("math", null);
		
		// 데이터 꺼내기
		System.out.println(hm.get("kor"));
		System.out.println(hm.get("eng"));
		System.out.println(hm.get("math"));
		
		System.out.println("---------------");
		// 객체를 넣는 것이므로 null 사용 가능
		hm.put("math", 100);
		
		// 데이터 꺼내기
		System.out.println(hm.get("kor"));
		System.out.println(hm.get("eng"));
		System.out.println(hm.get("math"));
		
	}

}





