package model;


public class Reservation {
	private String username;
	private String flightNum;
	private String flightName;
	private String departureTime;
	private String arrivalTime;
	private String origin;
	private String destination;
	private int numOfSeats;
	private Price priceInfo;
	
	public Reservation(String username, String flightNum, String flightName, String departureTime, String arrivalTime,
			String origin, String destination, int numOfSeats) {
		this.username = username;
		this.flightNum = flightNum;
		this.flightName = flightName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.origin = origin;
		this.destination = destination;
		this.numOfSeats = numOfSeats;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public Price getPriceInfo() {
		return priceInfo;
	}

	public void setPriceInfo(Price priceInfo) {
		this.priceInfo = priceInfo;
	}
}
