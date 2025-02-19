package p0214;

public class MathTest {
	
	public static void main(String[] args) {
		float f =1234;
		double d = f;
		d = Math.round(1.2);//반올림
		System.out.println(d);
		d= Math.floor(1.7);//내림
		System.out.println(d);
		d = Math.ceil(1.2);//올림
		System.out.println(d);
	}

}
