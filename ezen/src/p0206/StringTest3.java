package p0206;

public class StringTest3 {

	public static void main(java.lang.String[] args) {
		int i = 1;
		double bl = 1;
		System.out.println(i==1);
		System.out.println(bl);//1.0
		System.out.println(bl+1);//2.0
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1);//안녕
		System.out.println(str2);//안녕
		System.out.println(str1.equals(str2));
		
		String str3 = "안녕";
		String str4 = "안녕";
		System.out.println(str3==str4);
	}
}






