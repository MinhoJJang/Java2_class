package override;

public class Army extends Unit{

	// 부모 클래스의 생성자를 강제 호출하기 위한 생성자
	public Army(String name) {
		super(name);
	}
	
	// 공격의 형태를 육군에 맞게 변경하지만
	// 부모 클래스가 가지고있는 공격 준비 기능을
	// super키워드를 통해 보전하고 있다.
	@Override
	public void attack() {
		super.attack();
		System.out.println(super.getName() + " >> 지상공격 실행함");
	}
	
	// 이 클래스만의 독자적인 기능 추가
	public void tank() {
		System.out.println(super.getName() + " >> 탱크공격");
	}
}
