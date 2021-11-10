package model;

import java.util.ArrayList;

public class LoginContainer{
	private ArrayList<Login> logins;
	private static LoginContainer instance;
	/**
	 * @return the flights
	 */
	private LoginContainer() {
		this.logins = new ArrayList<>();
	}

	public static LoginContainer getInstance() {
		if(instance==null) {
			instance = new LoginContainer();
		}
		return instance;
	}
	/**
	 * @param flights the flights to set
	 */
	public void addLogins(Login login) {
		logins.add(login);
	}
	
	public void deleteLogins(Login login) {
		logins.remove(login);
	}
	/**
	 * @return the flights
	 */
	public ArrayList<Login> getLogins() {
		return logins;
	}
	
}