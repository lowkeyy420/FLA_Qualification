package model.highscore;

import java.util.Vector;

public class HighScoreList {

	//singleton
	private static HighScoreList instance;
	public static HighScoreList getInstance() {
		if(instance == null) instance = new HighScoreList();
		return instance;
	}
	
	private HighScoreList() {
//		System.out.println("run this class");
	}
	
	private Vector<HighScore> highscoreList = new Vector<HighScore>();
	
	public void addHighScore(HighScore newScore) {
		highscoreList.add(newScore);
		highscoreList.sort((a,b) -> b.getScore() - a.getScore()); // sort by highest score
	}
	
	public Vector<HighScore> getHighscoreList() {
		return highscoreList;
	}

	public void setHighscoreList(Vector<HighScore> highscoreList) {
		this.highscoreList = highscoreList;
	}
	
	
	
}
