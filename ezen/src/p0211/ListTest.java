package p0211;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(3);
		nums.add(2);
		nums.add(1);
		nums.add(10);
		nums.add(7);
		nums.add(5);
		
		int tmp = nums.get(2);
		nums.set(2, nums.get(0));
		nums.set(0, tmp);
		System.out.println(nums);
		tmp = nums.get(5);
		nums.set(5, nums.get(3));
		nums.set(3, tmp);
		System.out.println(nums);
	}
}
