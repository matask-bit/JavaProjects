package model;

import java.util.ArrayList;

public class RegistrationContainer{
	private ArrayList<Registration> registrations;
	private static RegistrationContainer instance;
	/**
	 * @return the flights
	 */
	private RegistrationContainer() {
		this.registrations = new ArrayList<>();
	}

	public static RegistrationContainer getInstance() {
		if(instance==null) {
			instance = new RegistrationContainer();
		}
		return instance;
	}
	/**
	 * @param registrations the flights to set
	 */
	public void addRegistrations(Registration registration) {
		registrations.add(registration);
	}
	
	public void deleteRegistrations(Registration registration) {
		registrations.remove(registration);
	}
	/**
	 * @return the flights
	 */
	public ArrayList<Registration> getRegistrations() {
		return registrations;
	}
	
	
}