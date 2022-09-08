package facade;

import java.io.BufferedWriter;
import java.io.File;

public class FileHandler {
	
	
	private FileHandler instance;
	public FileHandler getInstance() {
		if(instance == null) instance = new FileHandler();
		return instance;
	}
	
	public void writeHighScore() {
		
	}
	
	public void readHighScore() {
		File fp = new File("files/highscore.txt");
		if(fp.exists() == false) System.out.println("a");
		
		
	}
	
}
