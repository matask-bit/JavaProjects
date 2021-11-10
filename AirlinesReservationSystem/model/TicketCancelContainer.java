package model;

import java.util.ArrayList;

public class TicketCancelContainer{
	private ArrayList<TicketCancel> cancels;
	private static TicketCancelContainer instance;
	/**
	 * @return the flights
	 */
	private TicketCancelContainer() {
		this.cancels = new ArrayList();
	}

	public static TicketCancelContainer getInstance() {
		if(instance==null) {
			instance = new TicketCancelContainer();
		}
		return instance;
	}
	/**
	 * @param flights the flights to set
	 */
	public void addCancels (TicketCancel cancel) {
		cancels.add(cancel);
	}
	
	public void deleteCancels(TicketCancel cancel) {
		cancels.remove(cancel);
	}
	/**
	 * @return the flights
	 */
	public ArrayList<TicketCancel> getCancels() {
		return cancels;
	
	
}}