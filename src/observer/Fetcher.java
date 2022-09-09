package observer;

public interface Fetcher {
	public void addObsv(Observer obs);
	public void removeObsv(Observer obs);
	public void reset();
	public void run();
}
