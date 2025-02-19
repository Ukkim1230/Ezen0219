package p0203;

public class Loop2 {

	public static void main(String[] args) {
		int num = 5;
		// 1부터 num까지 출력하는 반복문
		// num부터 1까지 출력하는 반복문
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
		
		for(int i=num;i>=1;i--) {
			System.out.println(i);
		}
	}
}
