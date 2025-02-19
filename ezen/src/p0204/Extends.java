package p0204;

class GrandFather{
	String name = "할아버지";
	void test() {
		System.out.println("난 할아버지 테스트");
	}
}
class Mother extends GrandFather{
	int money = 100000;
	int age;
	void test() {
		System.out.println("난 엄마 테스트");
	}
}
public class Extends extends Mother{
	String address = "asdf";
	void test() {
		System.out.println("난 그냥 테스트");
	}
	public static void main(String[] args) {
		GrandFather e = new Extends();
		e.test();
	}
}
