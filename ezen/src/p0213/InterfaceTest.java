package p0213;

//영역이 없어도 됨 오히려 영역설정시 오류
//예외) default 예약어,static 구현가능
//메모리 생성 x ex)Action ac = new Action();X
//예외)
public class InterfaceTest implements Action {
	public void eat() {
		System.out.println("먹는다");
	}
	public void play() {
		System.out.println("논다");
	}
	public void work() {
		System.out.println("일한다");
	}
	public void sleep() {
		System.out.println("잔다");
	}
	public static void main(String[] args) {
		Action a = new InterfaceTest();
		a.eat();
		a.play();
		a.work();
		//a.sleep();
	}
}
