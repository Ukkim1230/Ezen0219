package p0212;

import java.util.ArrayList;

public class ListTest4 {
	
	public static void main(String[] args) {
	 Computer c1 = new Computer();
	 c1.setCpu("Amd Ryzen 5 9600x");
	 c1.setRam("16Gb + 16Gb");
	 c1.setHdd("20Tb");
	 c1.setGpu("Rtx4060");
	 c1.setMain("B650mk");
	 
	 Computer c2 = new Computer();
	 c2.setCpu("Amd Ryzen 7 7800X3d");
	 c2.setRam("16Gb + 16Gb");
	 c2.setHdd("20Tb");
	 c2.setGpu("Rtx 4070 ti super");
	 c2.setMain("Z890");
	 
	 ArrayList<Computer> c = new ArrayList<>();
	 c.add(c1);
	 c.add(c2);
	 System.out.println(c);
	}

}
