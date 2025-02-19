package p0203;

public class ExitTest {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				return;
			}
		}
		System.out.println("반복문이 종료되었습니다.");
	}
}
