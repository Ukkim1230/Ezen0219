package p0211;

import java.util.ArrayList;
import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("1");
		str.add("1");
		str.add("1");
		str.add("1");
		System.out.println(str.size());//4
		HashSet<String> set = new HashSet<>();
		set.add("2");
		set.add("1");
		set.add("3");
		set.add("7");
		set.add("4");
		set.add("9");
		set.add("8");
		System.out.println(set);//[2,1,3,7]
	}
}
