package model;

import java.util.ArrayList;

public class TransactionContainer{
	private ArrayList<Transaction> transactions;
	private static TransactionContainer instance;
	/**
	 * @return the flights
	 */
	private TransactionContainer() {
		this.transactions = new ArrayList();
	}

	public static TransactionContainer getInstance() {
		if(instance==null) {
			instance = new TransactionContainer();
		}
		return instance;
	}
	/**
	 * @param flights the flights to set
	 */
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	public void deleteTransaction(Transaction transaction) {
		transactions.remove(transaction);
	}
	/**
	 * @return the flights
	 */
	public ArrayList<Transaction> getTransaction() {
		return transactions;
	}
	
	
}