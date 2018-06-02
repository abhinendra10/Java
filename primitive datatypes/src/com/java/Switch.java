package com.java;

public class Switch {
	public static void main(String[] args) {
		System.out.println(determineNameOfDay(4));
		System.out.println(determineNameOfMonth(10));
		System.out.println(isWeekDay(4));
	}

	public static boolean isWeekDay(int dayNumber) {
		switch(dayNumber) {
		case 1 : 
		case 2 : 
		case 3 : 
		case 4 : 
		case 5 : return true;
		case 6 : return false;
		case 7 : return false;
		}
		return false;
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch(monthNumber) {
		case 1 : return "January";
		case 2 : return "February";
		case 3 : return "March";
		case 4 : return "April";
		case 5 : return "May";
		case 6 : return "June";
		case 7 : return "July";
		case 8 : return "August";
		case 9 : return "September";
		case 10 : return "October";
		case 11 : return "November";
		case 12 : return "December";
		default : return "Invalid Month Number; Enter between 1 and 12";
		}
	}

	public static String determineNameOfDay(int dayNumber) {
		
		switch(dayNumber) {
		case 1 : return "Monday";
		case 2 : return "Tuesday";
		case 3 : return "Wednesday";
		case 4 : return "Thursday";
		case 5 : return "Friday";			
		case 6 : return "Saturday";
		case 7 : return "Sunday";
		default : return "Invalid Day Number";
	
		}
	}

}
