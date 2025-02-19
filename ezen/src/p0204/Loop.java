package p0204;

public class Loop {

	public static void main(String[] args) {
		//총 9개의 포문을 사용해서
		//구구단 1단부터 9단까지 출력해주세요
		/*
		 * 1 X 1 = 1
		 * 1 X 2 = 2
		 * ...
		 * ..
		 * 9 X 9 = 81
		 */
		for(int j=1;j<=9;j++) {
			for(int i=1;i<=9;i++) {
				System.out.println(j + " X " + i + " = " + (j*i));
			}
		}
		
		// 다중 포문을 사용해서 구구단을 완성해주세요.
	}
}
