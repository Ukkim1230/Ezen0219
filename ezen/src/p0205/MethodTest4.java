package p0205;

public class MethodTest4 {
	static void printGugudan(int dan) {
		for(int i=1;i<10;i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
	}
	public static void main(String[] args) {
		//printGugudan 이라는 메서드를 만들어서 
		//입력되니 단을 출력하는 반복문코드를 완성해주세요.
		for(int i=1;i<10;i++) {
			printGugudan(i);
		}
	}
}
