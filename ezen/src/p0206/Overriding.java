package p0206;

class Mother{ //extends Object
	void work() {
		System.out.println("어머님이 일하신다.");
	}
}
public class Overriding extends Mother{
	void work() {
		System.out.println("내가 일한다.");
	}
	// 홍길동은 사람으로 부를 수 있다.
	// 즉 사람 s = new 홍길동()이 가능하지만
	// 사람은 홍길동이라고 부를 수 없다.
	// 즉 홍길동 h = new 사람()은 불가능하다!!
	public static void main(String[] args) {
		Overriding o = new Overriding();
//		Overriding o2 = new Mother();
		o.work(); //오버라이딩의 work();
		
		Mother m = new Overriding();
		m.work();//오버라이딩의 work();
	}

}
