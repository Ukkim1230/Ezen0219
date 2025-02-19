package p0214;

interface Test {
	void test();
}

public class InterfaceTest {

	public static void main(String[] args) {
		Test t = new Test() {
			public void test() {
				System.out.println("안녕 난 테스트야");
			}
		};
		t.test();
	}
}