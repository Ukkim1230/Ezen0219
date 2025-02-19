package p0207;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		int[]  nums = new int[3];
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list.size());
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(22);
		list.add(31);
		System.out.println(list.size());
		list.remove(1);
		System.out.println(list.size());
	}
}
