package p0210;

public class Gugudan {
	static void printGugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.print(dan + " X " + i + " = " + (dan*i));
			if(i!=9) {
				System.out.print(",");
			}
		}

	}

	public static void main(String[] args) {
		//위의 printGugudan을 호출하여 
		//1단부터 9단까지 출력하는 코드를 완성해주세요.
		for(int i=1;i<=9;i++) {
			printGugudan(i);
			System.out.println();
		}
	}
}
