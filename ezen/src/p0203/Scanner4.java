package p0203;

import java.util.Scanner;

public class Scanner4 {

	public static void main(String[] args) {
		// 스캐너클래스를 사용하여
		// 사용자에게 숫자를 입력받아
		// 해당 단을 출력하는 반복문을 완성하면 됩니다.
		// 예를 들어 9를 입력했다면 9단이 출력되면 됩니다.
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 단을 입력해주세요 : ");
		String numStr = s.nextLine();
		int dan = Integer.parseInt(numStr);
		for(int i=1;i<=9;i++) {
			System.out.println(dan  + " X " + i + " = " + (dan*i));
		}
	}
}
