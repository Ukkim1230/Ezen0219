package p0207;

public class WrapperClass {

	public static void main(String[] args) {
		byte b1 = 1;
		Byte b2 = 1;
		short s1 = 1;
		Short s2 = 1;
		int i1 = 1000000000;
		Integer i2 = 1;
		
		String str = "123";
		int num = Integer.parseInt(str);
		
		str = Integer.toString(123);
		
		long l1 = 10000000000L;
		Long l2 = 1L;
		
		float f1 = 1.1F;
		Float f2 = 1.1F;
		double db1  = 1.1;
		Double db2 = 1.1;
		str = "1.1";
		double num2 = Double.parseDouble(str);
		System.out.println(num2);
		
		
		char c1 = 'a';
		Character c2 = 'a';
		
		boolean bl1 = true;
		Boolean bl2 = true;
	}
}
