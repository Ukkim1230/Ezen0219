package p0213;

public abstract class Monster {
	public Monster() {
		System.out.println("난 몬스터지~");
	}
	public abstract void test();
	public void attack() {
		System.out.println("공격");
	}
}

class Randal extends Monster{
	public void test() {
		System.out.println("난 오버라이딩 된 테스트!");
	}
	
}
class AbstractTest {
	public static void main(String[] args) {
		Monster m = new Randal();
		m.test();
	}
}
