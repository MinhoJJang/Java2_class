package override;

public class Main01 {

	public static void main(String[] args) {
		Army am = new Army("����");
		Navy nv = new Navy("�ر�");
		AirForce af = new AirForce("����");
		
		am.attack();
		am.tank();
		
		nv.attack();
		nv.nucleus();
		
		af.attack();
		af.bombing();
		
	}

}
