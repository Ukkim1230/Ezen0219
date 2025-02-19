package p0203;

public class Array2 {

	public static void main(String[] args) {
		char c1 = '안';
		char c2 = '녕';
		char c3 = '하';
		char c4 = '세';
		char c5 = '요';
		char c6 = '.';
		char[] hello = new char[] {'안','녕','하','세','요','.'};
		
		for(int i=0;i<hello.length;i++) {
			System.out.print(hello[i]);
		}
		System.out.println();
		for(int i=hello.length-1;i>=0;i--) {
			System.out.print(hello[i]);
		}
	}
}
