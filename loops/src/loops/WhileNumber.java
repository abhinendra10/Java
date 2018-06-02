package loops;

public class WhileNumber {

	private int number;

	public WhileNumber(int number) {
		this.number = number;
	}

	public void printSquaresUptoLimit() {
		int squareNumber = 1;
		while(squareNumber*squareNumber<number) {
			System.out.print(squareNumber*squareNumber + " ");
			squareNumber++;
		}
		System.out.println();
	}

	public void printCubesUptoLimit() {
		int cubeNumber = 1;
		while(cubeNumber*cubeNumber*cubeNumber<number) {
			System.out.print(cubeNumber*cubeNumber*cubeNumber + " ");
			cubeNumber++;
		}
		System.out.println();
	}
	
}
