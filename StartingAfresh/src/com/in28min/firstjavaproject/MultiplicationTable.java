package com.in28min.firstjavaproject;

public class MultiplicationTable {
	void print(int tableOf) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d", tableOf, i, tableOf*i).println();
		}
	}

}
