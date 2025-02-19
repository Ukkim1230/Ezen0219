package p0206;

class Test2{
	public int toInt() {
		return 1;
	}
	
	public String toString() {
		return "abc";
	}
}
public class StringTest2 extends Test2{//extends Object
	
	public static void main(String[] args) {
		StringTest2 st = new StringTest2();
		int num = st.toInt();
		System.out.println(num);//1
		String str = st.toString();
		System.out.println(str);
		
		Object o = new StringTest2();
		String objStr = o.toString();
		System.out.println(objStr);
	}
}
