package p0203;

public class Scope {

	public static void main(String[] args) {
		int i = 1;
		if(i==1) {
			System.out.println("i는 1이구나");
			int i2 = 1;
		}
		int i2 = 1;
	}
	
	void test() {
		int i = 1;
	}
}
