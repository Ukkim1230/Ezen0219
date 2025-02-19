package p0203;

public class Loop3 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			//홀수일때만 출력
			if(i % 2 ==1) {
				System.out.println(i);
			}
		}
	}
}
