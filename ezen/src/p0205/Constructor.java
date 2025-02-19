package p0205;

import java.util.Scanner;

public class Constructor {
	public Constructor(int i) {
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		Constructor c = new Constructor(1);
		System.out.println(c);
		Scanner s = new Scanner(System.in);
	}
}
