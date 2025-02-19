package p0214;

public class While {
	
	public static void main(String[] args) {
		int i=1;
		while(i>2) {//조건이 만족하면 실행
			System.out.println(i++);
		}
		do {
			System.out.println(i++);//조건이 만족하지 않더라도 1번은 실행
		}while(i>2);
	}

}
