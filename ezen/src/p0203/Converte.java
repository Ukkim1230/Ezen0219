package p0203;

public class Converte {

	public static void main(String[] args) {
		int i = 1;
		String str = i + "";
		
		str = "11";
		
		i = Integer.parseInt(str);
		System.out.println(i+1);
	}
}
