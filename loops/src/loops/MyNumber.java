package loops;

public class MyNumber {

	private int number;
	
	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		int count=0;
		for(int i=1; i<=number; i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true; 
		}
		else 
			return false;
	}

	public int sumUptoN() {
		int sumUptoN = 0;
		for(int i=number; i>0; i--) {
			sumUptoN += i;
		}
		return sumUptoN;
	}

	public int sumOfDivisors() {
		int sumOfDivisors = 0;
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				sumOfDivisors += i;
			}
		}
		return sumOfDivisors;
	}

	public void printANumberTriangle() {
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	

}
