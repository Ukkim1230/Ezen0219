package p0212;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		// 5개의 게임을 만들어주세요.
		/*
		 * 1.name = 삼국지, price = 30000,genre =전략
		 * 2.name = LOL , price = 0,genre = 실시간전략
		 * 3.name = 카트라이더, price = 0 genre=스포츠
		 * 4.name = 스타크래프트,price = 15000,genre=실시간전략
		 * 5.name = 오버워치,price = 32000,genre=슈팅
		 */
		Game g1 = new Game();
		g1.setName("삼국지");
		g1.setPrice(30000);
		g1.setGenre("전략");
		//System.out.println(g1);
		Game g2 = new Game();
		g2.setName("LOL");
		g2.setPrice(0);
		g2.setGenre("실시간전략");
		//System.out.println(g2);
		Game g3 = new Game();
		g3.setName("카트라이더");
		g3.setPrice(0);
		g3.setGenre("스포츠");
		//System.out.println(g3);
		Game g4 = new Game();
		g4.setName("스타크래프트");
		g4.setPrice(15000);
		g4.setGenre("실시간전략");
		//System.out.println(g4);
		Game g5 = new Game();
		g5.setName("오버워치");
		g5.setPrice(32000);
		g5.setGenre("슈팅");
		//System.out.println(g5);
		ArrayList<Game> gameList = new ArrayList<>();
		gameList.add(g1);
		gameList.add(g2);
		gameList.add(g3);
		gameList.add(g4);
		gameList.add(g5);

		for (Game g : gameList) {
			// 장르에 "전략"이라는 단어가 들어간 게임만 출력해주세요
			// 장르에 "전략"이라는 단어가 들어가고 price가 0원이 아닌것만
			// int price= g.getPrice();
			// String genre = g.getGenre();
			if (g.getGenre().contains("전략") && g.getPrice() != 0) {
				
			}
		}
		for (Game g : gameList) {
			//price가 15000원 이상 30000원 미만인 것만 출력
			if(g.getPrice()<30000 && g.getPrice()>=15000) {
				System.out.println(g);
		}
	}
}
}