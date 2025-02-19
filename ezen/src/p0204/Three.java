package p0204;

public class Three {

	public static void main(String[] args) {
		//1부터 100까지 출력하되
		//숫자중에 3이 들어가면 짝을 출력해주세요.
		/*
		 * 1
		 * 2
		 * 짝
		 * ...
		 * 11
		 * 12
		 * 짝
		 */
		for(int i=1;i<=100;i++) {
			if(i % 10 == 3 || i / 10 == 3) {
				System.out.println(i + ":짝");
			}
		}

		//1부터 100까지 출력하되
		//숫자중에 6이 들어가면 짝을 출력해주세요.

		for(int i=1;i<=100;i++) {
			if(i % 10 == 6 || i / 10 == 6) {
				System.out.println(i + ":짝");
			}
		}
		
	}
}
