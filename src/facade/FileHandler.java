package facade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

import model.highscore.HighScore;

public class FileHandler {
	
	
	private static FileHandler instance;
	public static FileHandler getInstance() {
		if(instance == null) instance = new FileHandler();
		return instance;
	}
	
	public void writeHighScore(Vector<HighScore> data) {
		File fp = new File("files/highscore.txt");
		
		try {
			if(!fp.exists()) fp.createNewFile();
			FileWriter FW = new FileWriter(fp);
			
			for (HighScore score: data) {
				FW.write(score.getName()+"#"+score.getScore()+'\n');
			}
			
			FW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public Vector<HighScore> readHighScore() throws FileNotFoundException {
		File fp = new File("files/highscore.txt");
		Vector<HighScore> data = new Vector<HighScore>();
		Scanner fs = new Scanner(fp);
		while(fs.hasNextLine()) {
			String line = fs.nextLine();
			String[] split = line.split("#");
			String username = split[0];
			Integer score = Integer.parseInt(split[1]);
			data.add(new HighScore(username, score));
		}
		
		fs.close();	
		return data;
	}
	
}
