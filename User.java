package rsa.service;

import rsa.shared.Car;
import rsa.shared.PreferredMatch;
import rsa.shared.RideRole;
import rsa.shared.UserStars;

public class User {
	private String name,nick,password;

	protected User(String name, String nick, String password) {
		super();
		this.name = name;
		this.nick = nick;
		this.password = password;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getNick() {
		return nick;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	public void addCar(Car car) {
		
	}
	
	public void addStars(UserStars moreStars, RideRole role) {
		
	}
	
	protected boolean authenticate(String password) {
		
	}
	
	protected void deleteCar(String plate) {
		
	}
	
	public float getAverage(RideRole role) {
		
	}
	
	public Car getCar(String plate){
		
	}
	
	public PreferredMatch getPreferredMatch() {
		
	}
	
	protected  void setPreferredMatch(PreferredMatch preferredMatch) {
		
	}
	
	
}

