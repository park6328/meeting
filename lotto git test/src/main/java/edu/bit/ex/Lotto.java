package edu.bit.ex;

import java.util.HashSet;

public class Lotto {
	
	HashSet<Integer> set;
	
	public HashSet<Integer> getset() {
		
		set = new HashSet<Integer>();
		
		while (set.size() < 6) {
			set.add((int) (Math.random() *45) +1); //add 중복 안된다....
		}
		return set;
	}
	
	public void setset(HashSet<Integer> set) {
		this.set = set;
	}
}