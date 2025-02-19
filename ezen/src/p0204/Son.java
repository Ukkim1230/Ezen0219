package p0204;

class Human{
	void work() {
		System.out.println("일을 합니다.");
	}
}
public class Son extends Human{
	void work() {
		System.out.println(" 아들이 일을 합니다.");
	}
	void sleep() {
		System.out.println("아들이 잡니다.");
	}

	public static void main(String[] args) {
		Son s = new Son();
		s.work();
		s.sleep();
		Human h = new Son();
		h.work();
		
		Son s2 = (Son)h;
		
	}
}
