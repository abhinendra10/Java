
public class MyChar {
	
	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		switch(ch) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' : return true;
		default : return false;
		}
	
	}

	public static void printLowerCaseAlphabets() {
		for(char i='a'; i<='z'; i++) {
			System.out.printf("%c ", i);
		}
		System.out.println();
	}

	public static void printUpperCaseAlphabets() {
		for(char i='A'; i<='Z'; i++) {
			System.out.printf("%c ", i);
		}
	}

//	public Boolean inNumber() {
//		return null;
//	}

}
