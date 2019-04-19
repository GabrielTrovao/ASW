package rsa.service;

import rsa.shared.Location;
import rsa.shared.RideMatchInfo;
import rsa.shared.RideRole;
import rsa.shared.UserStars;

public class Matcher {
	
	class RideMatch {
		protected long id;
		protected Map<RideRole,Ride> rides;
		
		RideMatch(Ride lefthis.rides = 
		}
		
		public long getId() {
			return this.id;
		}
		
		public Ride getRide(RideRole role) {
			return rides.get(role);
		
		protected boolean matchable() {
			
		}
	}
	
	public void acceptMatch(long rideId, long matchId) {
		Matcher novoMatch = new Matcher();
		
	}
	
	public void addRide(User user, Location from, Location to,String plate, float cost) {
		Ride volta = new Ride(user,from,to,plate,cost);
	}
	
	public void concludeRide(long rideId, UserStars stars) {
		
	}
	
	public static Location getBottomRight() {
		
	}
	
	public static double getRadius() {
		
	}
	
	public static Location getTopLeft() {
		
	}
	
	
	public static void setBottomRight(Location bottomRight) {
		
	}
	
	public static void setRadius(double radius) {
		
	}
	
	public static void setTopLeft(Location topLeft) {
		
	}
	
	private java.util.SortedSet<RideMatchInfo> updateRide(long rideId, Location current) {
		setCurrent(current);
		
	}
}
