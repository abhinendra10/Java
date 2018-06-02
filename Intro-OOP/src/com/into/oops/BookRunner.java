package com.into.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book artOfComputerProgramming = new Book();
		Book effectiveJava = new Book();
		Book cleanCode = new Book();
		
		artOfComputerProgramming.setNoOfCopies(1400);;
		effectiveJava.setNoOfCopies(800);
		cleanCode.setNoOfCopies(690);		
		
		artOfComputerProgramming.increaseNoOfCopies(50);
		cleanCode.decreaseNoOfCopies(700);
		
		System.out.println(cleanCode.getNoOfCopies());
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		
		
		

	}

}
