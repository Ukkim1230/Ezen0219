package p0212;

import java.util.ArrayList;

public class FcOnline {
	/*
	 * name; 킬리안 음바페 season; 25Toty stats; 120 height; 182 footed; 오른발잡이
	 */
	public static void main(String[] args) {

		Player p1 = new Player();
		p1.setName("킬리안 음바페");
		p1.setSeason("25Toty");
		p1.setStats(120);
		p1.setHeight(182);
		p1.setFooted("오른발잡이");

		Player p2 = new Player();
		p2.setName("지네딘 지단");
		p2.setSeason("Ballon");
		p2.setStats(117);
		p2.setHeight(185);
		p2.setFooted("양발잡이");

		Player p3 = new Player();
		p3.setName("호나우두");
		p3.setSeason("Icon The Moment");
		p3.setStats(124);
		p3.setHeight(183);
		p3.setFooted("양발잡이");

		Player p4 = new Player();
		p4.setName("리오넬 메시");
		p4.setSeason("24Toty");
		p4.setStats(118);
		p4.setHeight(169);
		p4.setFooted("왼발잡이");

		Player p5 = new Player();
		p5.setName("주드 벨링엄");
		p5.setSeason("24Toty");
		p5.setStats(122);
		p5.setHeight(186);
		p5.setFooted("양발잡이");

		ArrayList<Player> pl = new ArrayList<>();
		pl.add(p1);
		pl.add(p2);
		pl.add(p3);
		pl.add(p4);
		pl.add(p5);

		for (Player p : pl) {
			if (p.getFooted().indexOf("왼발잡이") == 0 && p.getStats() > 120 && p.getHeight() > 185.0) {
				System.out.println(p);
			} else {
				System.out.println("조건에 맞는 선수는 존재하지 않습니다.");
			}

		}
	}
}