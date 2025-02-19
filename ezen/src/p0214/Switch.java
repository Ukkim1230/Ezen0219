package p0214;

public class Switch {

	public static void main(String[] args) {
		int age = 9;

		age /= 10;
		switch (age) {
		case 10:
			System.out.println("10살");
		case 20:
			System.out.println("20살");
		case 30:
			System.out.println("30살");
		default:
			System.out.println("노땅");

		}
	}
}