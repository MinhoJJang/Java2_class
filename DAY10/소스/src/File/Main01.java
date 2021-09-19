package File;

import java.io.File;

public class Main01 {

	public static void main(String[] args) {
		// �����γ� ����θ� ������ �Ķ���ͷ� �����Ѵ�.
		// ��Ŭ�������� ����θ� ����� ���, ���� ������Ʈ��
		// ������ �ȴ�.
		File f1 = new File("src/File/Main01.java");
		
		// ���޵� ��ΰ� �������� �˻�
		// -> �������� �ʴ� ���Ϸ� �˻��� ��� ������ false
		boolean is_file = f1.isFile();
		System.out.println("isFile : " + is_file);
		
		// ���޵� ��ΰ� ���丮���� �˻�
		// -> �������� �ʴ� ���丮�� �˻��� ��� ������ false
		boolean is_dir = f1.isDirectory();
		System.out.println("isDirectory : " + is_dir);
		
		// ���޵� ����� ������ ���� ����
		String abs = f1.getAbsolutePath();
		System.out.println("������ : " + abs);
		
		// �����ڿ� ���޵� �����̳� ���丮�� ���������� �����ϴ����� �˻�
		boolean is_exit = f1.exists();
		System.out.println("���翩�� : " + is_exit);
		System.out.println("-------------------------");
		
		// ���丮 ���� ��ü ����
		File f2 = new File("a/b/c/target");
		System.out.println("isFile : " + f2.isFile());
		System.out.println("isDirectory : " + f2.isDirectory());
		System.out.println("������ : " + f2.getAbsolutePath());
		System.out.println("���翩�� : " + f2.exists());
		
		// ��ο� ���� ���丮 ����
		f2.mkdirs();
		
		
		
	}

}








