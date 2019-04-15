package com.aswtp2;

public abstract class Trie<T extends HasPoint>  {
	
	protected double bottomRightX; 
	protected double bottomRightY;
	private static int capacity; //(package private) -> nao permite criaçao fora desta classe
	protected double topLeftX;
	protected double topLeftY;
	
	protected Trie(double bottomRightX, double bottomRightY, double topLeftX, double topLeftY) {
		super();
		this.bottomRightX = bottomRightX;
		this.bottomRightY = bottomRightY;
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
	}
	
	static int getCapacity() {
		return capacity;
	}
	
	//como é este?
	static void setCapacity(int capacity) {
		capacity  = capacity;
	}
	
	//protected???
	protected void collectAll(java.util.Set<T> points){	
	}

	protected void collectNear(double x, double y, double radius, java.util.Set<T> points) {
		
	}
	
	protected void delete(T point) {
		
	}
	
	protected T find(T point) {
		T ponto;
		ponto.bottomRightY = point.bottomRightY;
		return ponto;
	}
	

	
	static double getDistance(double x1, double y1, double x2, double y2) {
		double result = Math.sqrt(Math.pow((y1-x1), 2) + Math.pow((y2-x2), 2));
		return result;
	}
	
	protected Trie<T> insert(T point){
		Trie<T> trie1 = null;
		return trie1;
	}
	
	protected Trie<T> insertReplace(T point){	
		Trie<T> trie1 = null;
		return trie1;
	}
	
	protected boolean overlaps(double x, double y, double radius) {
		
	}

	@Override
	public String toString() {
		return "Trie [bottomRightX=" + bottomRightX + ", bottomRightY=" + bottomRightY + ", topLeftX=" + topLeftX
				+ ", topLeftY=" + topLeftY + "]";
	}	
}
