package p0205;

public class Loop2 {

	public static void main(String[] agrs) {
		// 1부터 100까지 출력하는 반복문 완성해주세요.
		for(int i=1;i<=100;i++) {
			//5의 배수일때는 만세 아닐때는 숫자를 출력하면 됩니다.
			// 3이라는 숫자가 있을때는 짝
			// 위의 두가지 조건이 교차됬을대 만세짝
			if(i % 5 ==0) {
				if(i % 10 == 3 || i / 10 == 3) {
					System.out.println("만세짝");
				}else {
					System.out.println("만세");
				}
			}else if(i % 10 == 3 || i / 10 == 3) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
			
		}
	}
}
