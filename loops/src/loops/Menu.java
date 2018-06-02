package loops;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
		int number1 = scan.nextInt();
		System.out.print("\nEnter number 2: ");
		int number2 = scan.nextInt();
		System.out.println("1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply\n5 - Exit");
		int operation = 5;
		do {
			if(operation!=5) {
			System.out.println("Choose operation: ");
			}
			operation = scan.nextInt();
			switch(operation) {
			case 1 : System.out.println(number1+number2);
			break;
			case 2 : System.out.println(number1-number2);
			break;
			case 3 : System.out.println(number1/number2);
			break;
			case 4 : System.out.println(number1*number2);
			break;
			case 5 :
				default : break;
			}
		}while(operation!=5);
		
		
	}
}
