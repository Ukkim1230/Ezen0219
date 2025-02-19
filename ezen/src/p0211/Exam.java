package p0211;

import java.util.ArrayList;
import java.util.HashMap;

public class Exam {


	static void setList(ArrayList<Integer> nums) {
		nums.add(1);
		nums.add(1);
		nums = new ArrayList<>();
		nums.add(1);
	}
	static void setMap(HashMap<String,Integer> map) {
		map.put("1", 1);
		map.put("1", 2);
		map = new HashMap<>();
		map.put("1", 1);
	}
	public static void main(String[] args) {		
		ArrayList<Integer> nums2 = new ArrayList<>();
		setList(nums2);
		System.out.println(nums2);//[1,1],[]
		
		HashMap<String,Integer> map = new HashMap<>();
		setMap(map);
		System.out.println(map);//{1=2}
	}
}
