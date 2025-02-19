package p0210;

public class Gugudan2 {

	public static void main(String[] args) {
		String dan = "2";
		// dan이 1일경우에는 1단
		// dan이 2일경우에는 2단
		// 즉 단에 따라서 구구단을 출력하는 코드를 완성해주세요.
		int d = Integer.parseInt(dan);
		for(int i=1;i<=9;i++) {
			System.out.println(d + " X " + i + " = " + (d*i));
		}
	}
}
