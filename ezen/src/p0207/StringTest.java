package p0207;

public class StringTest {

	public static void main(String[] args) {
		String str1 = "안녕";
		String str2 = "안녕";
		System.out.println(str1==str2);//true
		
		String str3 = null;
		System.out.println(str1==str3);//false
		System.out.println(str2==str3);//false

		System.out.println(str1.equals(str3));//false
		System.out.println(str2.equals(str3));//false
		
		System.out.println(str3!=null && str3.equals("안녕"));//false
		System.out.println("안녕".equals(str3));//false
		System.out.println(str3.toString());//null or str3 or 메모리주소 or 오류
		//Integer.toString(1);
	}
}
