package Boxing;

public class Main01 {

	public static void main(String[] args) {
		AirForce af = new AirForce("����");
		Navy nv = new Navy("�ر�");
		Army am = new Army("����");
		
		// ������ ��ü�� �ڽŵ��� ���� ����� ����� �� ����
		af.bombing();
		nv.nucleus();
		am.tank();
		
		System.out.println("---------------------------------------");
		
		// �Ϲ��� ����ȯ
		// ��� ��ü�� �ڽ��� ���� ���·� �Ϲ��� ����ȯ ����
		Unit temp1 = af;
		Unit temp2 = nv;
		Unit temp3 = am;
		
		// ����ȯ�� �Ǵ��� ��ӹްų� ��������(Override)
		// �ڽŵ��� �⺻ Ư������ �״�� ������
		temp1.attack();
		temp2.attack();
		temp3.attack();
		
		System.out.println("---------------------------");
		
		// ���� Ŭ���� ���·� ����ȯ�� �Ǹ�, �ڽŵ��� ���� �����
		// ������� ����
//		temp1.bombing();
//		temp2.nucleus();
//		temp3.tank();
		
		// �ٽ� ������ ����� �ǵ����� ���ؼ���
		// ����Ŭ���� ���·� ����� ����ȯ�� �ʿ���
		AirForce re1 = (AirForce)temp1;
		Navy re2 = (Navy)temp2;
		Army re3 = (Army)temp3;
		
		// ������ ��� ���
		re1.bombing();
		re2.nucleus();
		re3.tank();
		
	}

}










