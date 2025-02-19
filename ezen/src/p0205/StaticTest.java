package p0205;
public class StaticTest {
	int i1 = 1;
	int i2 = 2;
	static int i3 = 3;
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest(); //선언
		System.out.println(st.i1);
		System.out.println(StaticTest.i3);
	}
	
}