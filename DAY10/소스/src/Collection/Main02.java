package Collection;

import java.util.ArrayList;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * ArrayList�� ����ϴ� ���� �Ϲ����� �����,
		 * ����� ���� Ŭ������ ���� ��ü�� �����ϵ���
		 * �����ϴ� ���̴�.
		 */
		
		// ��ü�� ��� ���� ArrayList
		ArrayList<People> pList = new ArrayList<People>();
		
		// 10���� �����͸� ���Ƿ� �߰���
		for( int i = 0; i<10; i++ ) {
			People p = new People("ȸ��" + i, "010-1234-567" + i);
			pList.add(p);
		}
		
		// ����ϱ�
		for(int i = 0; i<pList.size(); i++) {
			// ArrayList�� ����� �����͸� �ϳ� ������,
			// People Ŭ���� ���� ��ü��.
			People item = pList.get(i);
			System.out.println(item.toString());
		}
		
		
	}

}










