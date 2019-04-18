package rsa.service;
import rsa.quad.*;
import rsa.shared.Location;
import rsa.shared.PreferredMatch;
import rsa.shared.RideMatchInfo;
import rsa.shared.RideRole;
import rsa.shared.RideSharingAppException;
import rsa.shared.UserStars;
import java.util.*;

public class Manager {
	private Users allUsers;
	private Matcher matcher;
	
	// FEITO ----- CONFIRMAR (??)
	public void acceptMatch(long rideId, long matchId) {
		Matcher newMatch = new Matcher();
		newMatch.acceptMatch(rideId, matchId);
	}
	
	//como é aqui para a execepçao? -- FEITO --
	public long addRide(String nick,String password, Location from, Location to,String plate,float cost) throws RideSharingAppException {
		User novo_User = new User(nick,null,password);
		Ride novaRide = new Ride(novo_User, from, to, plate, cost);
		long rideID = novaRide.getId();
		return rideID;
	}
	
	//este está mal
	public boolean authenticate(String nick, String password) {
		User userTest = new User();
		
		if(userTest.getNick()nick.equals(nick) && userTest.getPassword())
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
		User user1  = new User(nick,name,password);
		
		return true;
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
