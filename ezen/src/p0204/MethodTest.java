package p0204;

public class MethodTest {
	int i;
	static void test() {
		System.out.println("첫번째 테스트");
	}
	static void test(int i) {
		System.out.println("두번째 테스트");
	}
	static void test(String i2) {
		System.out.println("세번째 테스트");
	}
	static void test(int i, String i2) {
		System.out.println("네번째 테스트");
	}
	static int test(String i, int i2) {
		System.out.println("다섯번쨰 테스트");
		return 1;
	}
	public static void main(String[] args) {
		test(1);
	}

}
