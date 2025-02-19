package p0212;

public class Player {
	private String name;
	private String season;
	private int stats;
	private double height;
	private String footed;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getSeason() {
		return season;
	}
	public void setStats(int stats) {
		this.stats = stats;
	}
	public int getStats() {
		return stats;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setFooted(String footed) {
		this.footed = footed;
	}
	public String getFooted() {
		return footed;
	}
	public String toString() {
		return "[name : " + name + ",season : " + season + ",stats : " + stats + ",height : " + height + ",footed : " + footed + "]";
	
	}
	public static void main(String[] args) {
		
	}
}