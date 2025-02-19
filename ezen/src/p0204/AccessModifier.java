package p0204;

public class AccessModifier {
	static int num;
	public static void main(String[] args) {
		AccessModifier.num = 10;
		System.out.println(AccessModifier.num);
		// public  default private
	}
}
