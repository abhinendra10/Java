package com.into.oops;

public class Book {
	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	 void setNoOfCopies(int noOfCopies) {
		if(noOfCopies>0) {
		this.noOfCopies = noOfCopies;
		}
	}
	
	public void increaseNoOfCopies(int houMuch) {
		this.noOfCopies += houMuch;
	}
	

	
	public void decreaseNoOfCopies(int houMuch) {
		setNoOfCopies(this.noOfCopies - houMuch);
	}	
}
