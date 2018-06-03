package com.arrays;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;



public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	public Student(String name, int... marks) {
		this.name = name;
		for(int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getMaxMark() {
		return Collections.max(marks);
	}

	public BigDecimal getAverageMarks() {
		BigDecimal average;
		average = new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(marks.size()));
		
		return average;
	}

	public int getTotalSumOfMarks() {
		int total = 0;
		for (int mark : marks) {
			total += mark;
		}
		return total;
	}

	public int getMinMark() {
		return Collections.min(marks);
	}
	
	@Override
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int newMark) {
		marks.add(newMark);
	}

	public void removeMarkAt(int position) {
		marks.remove(position);
	}


	

}
