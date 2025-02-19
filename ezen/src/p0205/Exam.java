package p0205;

class Exam2 {
	public Exam2() {
		System.out.println("이그잼2");
	}
	void test() {
		System.out.println("이그잼2 테스트!!");
	}
}
public class Exam extends Exam2{

	public Exam() {
		System.out.println("이그잼");
	}
	void test() {
		super.test();
		System.out.println("이그잼 테스트!!");
	}
	
	public static void main(String[] args) {
		Exam e = new Exam();
		e.test();
	}
}




