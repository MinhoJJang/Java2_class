package Collection;

import java.util.ArrayList;

public class Main01 {

	public static void main(String[] args) {
		/*
		 * ��ü ������ ���ʸ����� ���
		 * -> Ŭ���� �̸� �����ʿ� <�ڷ���>�� �������� ǥ���Ѵ�.
		 * �̶� �ڷ������� Ŭ����Ÿ�Ը� �����ϴ�.
		 * �⺻ ���������� ����ϰ��� �ϴ� ��쿡��
		 * �ش� ���������� WrapperClass�� ����ؾ� �Ѵ�.
		 */
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		
		// ������ �߰��ϱ�
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
		numberList.add(50);
		numberList.add(60);
		numberList.add(70);
		numberList.add(80);
		numberList.add(90);
		
		// �߰��� �������� ����
		int count = numberList.size();
		System.out.println("�������� ���� : " + count);
		
		// 5��° ����� �� ���
		int value = numberList.get(4);
		System.out.println("5��° ����� �� : " + value);
		
		// 5��° ��� ����
		numberList.remove(4);
		
		// �ϳ��� ���� ��, ��ü ũ�� �ٽ� ��ȸ -> 8��
		count = numberList.size();
		System.out.println("�������� ���� : " + count);
		
		// 5��° ����� ���� �ٽ� ���
		value = numberList.get(4);
		System.out.println("5��° ����� �� : " + value);
		
		// 5��° �ڸ��� ������ �߰�
		numberList.add(4, 123);
		value = numberList.get(4);
		System.out.println("5��° ����� �� : " + value);
		
		// ��ü ����
		numberList.clear();
		count = numberList.size();
		System.out.println("�������� ���� : " + count);
	}

}








