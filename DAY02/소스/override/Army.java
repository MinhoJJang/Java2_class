package override;

public class Army extends Unit{

	// �θ� Ŭ������ �����ڸ� ���� ȣ���ϱ� ���� ������
	public Army(String name) {
		super(name);
	}
	
	// ������ ���¸� ������ �°� ����������
	// �θ� Ŭ������ �������ִ� ���� �غ� �����
	// superŰ���带 ���� �����ϰ� �ִ�.
	@Override
	public void attack() {
		super.attack();
		System.out.println(super.getName() + " >> ������� ������");
	}
	
	// �� Ŭ�������� �������� ��� �߰�
	public void tank() {
		System.out.println(super.getName() + " >> ��ũ����");
	}
}
