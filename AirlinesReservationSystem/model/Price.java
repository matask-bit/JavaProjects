package model;

public class Price {
	private String className;
	private int seatNum;
	private double price;
	/**
	 * @param className
	 * @param seatNum
	 * @param price
	 */
	public Price(String className, int seatNum, double price) {
		super();
		this.className = className;
		this.seatNum = seatNum;
		this.price = price;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the seatNum
	 */
	public int getSeatNum() {
		return seatNum;
	}
	/**
	 * @param seatNum the seatNum to set
	 */
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
}
