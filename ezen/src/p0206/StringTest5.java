package p0206;

public class StringTest5 {

	public static void main(String[] args) {
		String str = " 우 리 나 라 ";
		int idx = str.indexOf(" ");//앞에서부터 검색해서 index : 0
		System.out.println(idx);
		idx = str.lastIndexOf(" ");//뒤에서부터 검색해서 index : 8
		System.out.println(idx);
		str = str.trim(); //앞뒤 공백을 제거함
		System.out.println(str);//우 리 나 라
		
		idx = str.indexOf("타");//-1
		if(str.indexOf("타")!=-1) {
			System.out.println("str에는 타라는 글자가 있다.");
		}else {
			System.out.println("str에는 타라는 글자가 없다.");
		}
		
		boolean hasTa = str.contains("타"); //false
		System.out.println(hasTa);
		if(str.contains("타")) {
			System.out.println("str에는 타라는 글자가 있다.");
		}else {
			System.out.println("str에는 타라는 글자가 없다.");
		}
	}
}
