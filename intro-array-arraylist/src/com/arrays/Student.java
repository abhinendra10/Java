package com.arrays;

import java.math.BigDecimal;


public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getMaxMark() {
		int maxMarks = marks[0];
		for(int mark : marks) {
			if(mark>=maxMarks) {
				maxMarks = mark;
			}
		}
		return maxMarks;
	}

	public BigDecimal getAverageMarks() {
		BigDecimal average;
		average = new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(marks.length));
		
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
		int minMarks = marks[0];
		for(int mark : marks) {
			if(mark<=minMarks) {
				minMarks = mark;
			}
		}
		return minMarks;
		}

}
