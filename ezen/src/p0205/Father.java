package p0205;

class Human{
	public Human() {
		System.out.println("난 Human클래스 생성자!");
	}
	void work() {
		System.out.println("사람이라면 일을 해야지!");
	}
}
public class Father extends Human{
	int i = 1;
	
	void test() {
		System.out.println("난 test 메서드!!");
	}
	public Father() {
		super();
		System.out.println("난 Father클래스 생성자!");
	}

	public static void main(String[] args) {
		Father f = new Father();
		f.work();
	}
}
