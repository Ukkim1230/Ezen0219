package p0204;

public class StaticTest {
	int num;
	String str;
	static int num2;
	public static void main(String[] args) {
		System.out.println(num2);
		StaticTest st = new StaticTest();
		System.out.println(st.str);
		System.out.println(st.num);
		st.num = 10;
		System.out.println(st.num);
	}
}
