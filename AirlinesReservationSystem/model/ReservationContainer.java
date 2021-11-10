package model;

import java.util.ArrayList;

public class ReservationContainer{
	private ArrayList<Reservation> reservations;
	private static ReservationContainer instance;
	/**
	 * @return the flights
	 */
	private ReservationContainer() {
		this.reservations = new ArrayList();
	}

	public static ReservationContainer getInstance() {
		if(instance==null) {
			instance = new ReservationContainer();
		}
		return instance;
	}
	/**
	 * @param flights the flights to set
	 */
	public void addFlights(Reservation reservation) {
		reservations.add(reservation);
	}
	
	public void deleteFlights(Reservation reservation) {
		reservations.remove(reservation);
	}
	/**
	 * @return the flights
	 */
	public ArrayList<Reservation> getReservations() {
		return reservations;
	}
	
	
}