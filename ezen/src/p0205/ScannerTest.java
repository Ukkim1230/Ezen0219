package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("생각하는 숫자를 작성해주세요 : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
		Random r = new Random();
		int rNum = r.nextInt(10)+1; //1-10까지늬 난수를 생성함 
		
		if(rNum == num) {
			System.out.println("맞췄다!");
		}else {
			System.out.println("틀렸다!");
		}
		System.out.println("난수 : " + rNum);
	}
}
