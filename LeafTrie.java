package com.aswtp2;

public class LeafTrie <T extends HasPoint> {

	private double x,y;
	double topLeftX,topLeftY, bottomRightX, bottomRightY;
	
	public LeafTrie(double topLeftX, double topLeftY, double bottomRightX, double bottomRightY)  {
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
		this.bottomRightX = bottomRightX;
		this.bottomRightY =  bottomRightY;
	
	}
	
	//métodos que herda da classe rsa.quad.try
	//getCapacity(), setCapacity(), overlaps(),setCapacity()
	
	private void collectAll(java.util.Set<T> nodes) {
		
	}
	
	private void collectNear(double x, double y, double radius, java.util.Set<T> nodes) {
		
	}
	
	private void delete(T point) {
		
	}
	
	private T find(T point) {
		
	}
	
	//erro neste e no a seguir porque ainda não fizemos a class Trie
	private Trie<T> insert(T point) {
		
	}
	
	private Trie<T> insertReplace(T point) {
		
	}

	@Override
	public String toString() {
		return "LeafTrie [x=" + x + ", y=" + y + ", topLeftX=" + topLeftX + ", topLeftY=" + topLeftY + ", bottomRightX="
				+ bottomRightX + ", bottomRightY=" + bottomRightY + "]";
	}
	
}
