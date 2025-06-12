import java.util.Queue;

/**
 * Teller - represents a bank clerk
 * 
 */
public class Teller extends Thread {
	
	private int tellerNumber; //the id of the teller

	private double idleMean;
	private double idleVar;
	
	private int custNumber; //the is of the last (current) served customer 
	private int customersServed; //the number of the customers which are served by the this teller

	/*
	 * Getters and setters
	 */
	public int getCustNumber() {
		return custNumber;
	}

	public int getTellerNumber() {
		return tellerNumber;
	}

	public boolean isServing() {
		
	}
	
	public boolean isIdle() {
		
	}

	/**
	 * run - main thread action
	 */
	public void run() {
	
	}

	

}
