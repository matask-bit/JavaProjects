package model;

public class Transaction {
	private String creditNum;
	private String creditType;
	private int pinNum;
	/**
	 * @param creditNum
	 * @param creditType
	 * @param pinNum
	 */
	public Transaction(String creditNum, String creditType, int pinNum) {
		super();
		this.creditNum = creditNum;
		this.creditType = creditType;
		this.pinNum = pinNum;
	}
	/**
	 * @return the creditNum
	 */
	public String getCreditNum() {
		return creditNum;
	}
	/**
	 * @param creditNum the creditNum to set
	 */
	public void setCreditNum(String creditNum) {
		this.creditNum = creditNum;
	}
	/**
	 * @return the creditType
	 */
	public String getCreditType() {
		return creditType;
	}
	/**
	 * @param creditType the creditType to set
	 */
	public void setCreditType(String creditType) {
		this.creditType = creditType;
	}
	/**
	 * @return the pinNum
	 */
	public int getPinNum() {
		return pinNum;
	}
	/**
	 * @param pinNum the pinNum to set
	 */
	public void setPinNum(int pinNum) {
		this.pinNum = pinNum;
	}
	
}
