package edu.bit.ex;

import java.util.HashSet;

public class Lotto {
	
	HashSet<Integer> set;
	
	public HashSet<Integer> getset() {
		
		set = new HashSet<Integer>();
		
		while (set.size() < 6) {
			set.add((int) (Math.random() *45) +1); //add �ߺ� �ȵȴ�....
		}
		return set;
	}
	
	public void setset(HashSet<Integer> set) {
		this.set = set;
	}
}