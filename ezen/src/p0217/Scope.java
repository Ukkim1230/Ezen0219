package p0217;

public class Scope {

	public Scope() {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	public static void main(String[] args) {
		new Scope();
		System.out.println("3");
	}
}