package model;

public class TicketCancel {
	private String username;
	private String flightNum;
	private String origin;
	private String destination;
	private String flightName;
	private String departureTime;
	private String arrivalTime;
	private String seatNum;
	/**
	 * @param username
	 * @param flightNum
	 * @param origin
	 * @param destination
	 * @param flightName
	 * @param departureTime
	 * @param arrivalTime
	 * @param seatNum
	 */
	public TicketCancel(String username, String flightNum, String origin, String destination, String flightName,
			String departureTime, String arrivalTime, String seatNum) {
		super();
		this.username = username;
		this.flightNum = flightNum;
		this.origin = origin;
		this.destination = destination;
		this.flightName = flightName;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.seatNum = seatNum;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the flightNum
	 */
	public String getFlightNum() {
		return flightNum;
	}
	/**
	 * @param flightNum the flightNum to set
	 */
	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}
	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}
	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the flightName
	 */
	public String getFlightName() {
		return flightName;
	}
	/**
	 * @param flightName the flightName to set
	 */
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	/**
	 * @return the departureTime
	 */
	public String getDepartureTime() {
		return departureTime;
	}
	/**
	 * @param departureTime the departureTime to set
	 */
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	/**
	 * @return the arrivalTime
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}
	/**
	 * @param arrivalTime the arrivalTime to set
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	/**
	 * @return the seatNum
	 */
	public String getSeatNum() {
		return seatNum;
	}
	/**
	 * @param seatNum the seatNum to set
	 */
	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	
}