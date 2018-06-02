package com.arrays;

import java.math.BigDecimal;

public class StudentRunner {
	public static void main(String[] args) {
		int[] marks = {68,58,60,89,74};
		Student student = new Student("Ashish", marks);
		int number = student.getNumberOfMarks();
		System.out.println("number of makrs in count are: " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Total sum of marks are: " + sum);
		int maxMark = student.getMaxMark();
		System.out.println(maxMark);
		int minMark = student.getMinMark();
		System.out.println(minMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average: " + average);
		
	}
}
