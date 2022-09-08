package model.highscore;

import java.io.FileNotFoundException;
import java.util.Vector;

import facade.FileHandler;
import facade.Helper;

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
	
	public static void printAllScores() {
		HighScoreList list = HighScoreList.getInstance();
		Helper hp = Helper.getInstance();
		hp.cls();
		
		int i = 0;
		for (HighScore a : list.getHighscoreList()) {
			System.out.println(i+1 + " " + "name: " + a.getName() + "\tscore : " + a.getScore());
			i++;	
			if(i == 9) break;
		}
		
	}
	
	public static void initScores() {
		HighScoreList list = HighScoreList.getInstance();
		FileHandler handler = FileHandler.getInstance();
		try {
			list.setHighscoreList(handler.readHighScore());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
