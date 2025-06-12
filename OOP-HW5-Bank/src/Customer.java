import java.util.Queue;

/**
 * Customer - represents a client of the bank.
 * 
 */
public class Customer extends Thread {
	
	private int custNumber; //the id of the customer
	private Bank bank;
	private int serviceTime;
	


	/*
	 * Getters and setters
	 */
	public int getCustNumber() {
		return custNumber;
	}

	/**
	 * run - main thread action
	 */
	public void run() {
		
	}

	/**
	 * serve - simulate the service the customer is getting. This method is called
	 * only by the teller servicing this customer. In addition to holding up the
	 * teller for the duration of the service, it also notifies this customer's
	 * thread that it has been serviced and therefore may terminate.
	 */
	public int serve()  {
		
	}

	@Override
	public String toString() {
		return String.valueOf(custNumber);
	}
	
	
} /* class Customer */
