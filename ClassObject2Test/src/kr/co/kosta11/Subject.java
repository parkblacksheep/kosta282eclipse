package kr.co.kosta11;

public class Subject {
	private String name;
	private int scorePoint;
	
	//vari
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	//s,g
	
	public Subject() {
		super();
	}
	public Subject(String name, int scorePoint) {
		super();
		this.name = name;
		this.scorePoint = scorePoint;
	}
	
	
	//Con
}
