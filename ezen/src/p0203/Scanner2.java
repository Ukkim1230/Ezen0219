package p0203;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("원하는 숫자를 적어주세요 : ");
		String str = s.nextLine();
		System.out.println("적은 숫자 : " + str);
	}
}
