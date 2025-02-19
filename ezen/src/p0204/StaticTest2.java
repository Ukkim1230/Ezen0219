package p0204;

public class StaticTest2 {
	int num1 = 1;
	static int num2 = 2;
	public static void main(String[] args) {
		System.out.println(StaticTest2.num2);
		StaticTest2 st = new StaticTest2();
		System.out.println(st.num2);
		st.num2 = 10;
		st = new StaticTest2();
		System.out.println(st.num2);
	}
}
