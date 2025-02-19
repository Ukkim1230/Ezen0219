package p0210;

public class Loop {

	public static void main(String[] args) {
		//1단부터 9단까지 출력하는 2중포문을 완성해주세요.
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(j!=9) {
					System.out.print(i + " X " + j + " = " + (i*9) + ",");
				}else {
					System.out.print(i + " X " + j + " = " + (i*9));
				}
			}
			System.out.println();
		}
	}
}
