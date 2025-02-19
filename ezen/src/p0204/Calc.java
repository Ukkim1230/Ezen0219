package p0204;

public class Calc {

	int add(int n1, int n2) {
		return n1+n2;
	}
	int minus(int n1, int n2) {
		return n1 - n2;
	}
	int multiple(int n1, int n2) {
		return n1 * n2;
	}
	int division(int n1, int n2) {
		return n1 / n2;
	}
	public static void main(String[] args) {
		Calc c = new Calc();
		int result = c.add(1,2);
		System.out.println(result);
		result = c.minus(1, 2);
		System.out.println(result);
		result = c.multiple(1, 2);
		System.out.println(result);
		result = c.division(1, 2);
		System.out.println(result);
		// minus 빼기, multiple 곱하기, division 나누기
	}
}
