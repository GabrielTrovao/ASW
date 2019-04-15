package com.aswtp2;

public class Manager {
	private Users allUsers;
	private Matcher matcher;
	
	public void acceptMatch(long rideId, long matchId) {
		
	}
	
	public boolean authenticate(java.lang.String nick, java.lang.String password) {
		
	}
	
	public void concludeRide(long rideId, UserStars classification) {
		
	}
	
	public double getAverage(java.lang.String nick, RideRole role) {
		
	}
	
	public static Manager getInstance() {
		
	}
	
	PreferredMatch getPreferredMatch(java.lang.String nick, java.lang.String password) {
		
	}
	
	public boolean register(java.lang.String nick, java.lang.String name, java.lang.String password) {
		
	}
	
	private void reset() {
		
	}
	
	void setPreferredMatch(java.lang.String nick, java.lang.String password, PreferredMatch preferred) {
		
	}
	
	public boolean updatePassword(java.lang.String nick, java.lang.String oldPassword, java.lang.String newPassword) {
		
	}
	
	java.util.Set<RideMatchInfo> updateRide(long rideId, Location current) {
		
	}
	
}
