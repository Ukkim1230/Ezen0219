package p0203;

public class Condition {

	public static void main(String[] args) {
		int age = 25;
		if(age<10) {
			System.out.println("애기구나");
		}else {
			if(age<20) {
				System.out.println("10대구나");
			}else {
				System.out.println("다 컷네~");
			}
		}
	}
}
