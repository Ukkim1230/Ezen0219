package p0205;

public class MethodTest6 {
	/*
	 * 오버로딩
	 * 1. 같은 영역이여야 한다.
	 * 2. 메소드명이 같아야 한다.
	 * 3. 매개변수의 갯수가 다르거나 매개변수의 데이터타입이 다르거나 갯수와 데이터 타입이 같더라도 순서가 달라야 한다.
	 */
	static int test() {
		return 1;
	}
	static void test(int num) {
		
	}
	static void test(String str) {
		
	}
	static void test(String str, int num) {
		
	}
	static void test(int str,  String num) {
		
	}
	public static void main(String[] args) {
		test(1);
	}
}
