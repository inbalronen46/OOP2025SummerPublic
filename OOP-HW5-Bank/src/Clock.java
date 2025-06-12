/**
 * WorkingHours - a main clock regulating the bank's work day
 * 
 */
public class Clock extends Thread {
	
	private int dayLength; // minutes
	private boolean isWorking;

	public void run() {

	}

	/*
	 * Getters and setters
	 */
	public boolean isWorking() {
		return isWorking;
	}

}
