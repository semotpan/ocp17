package book.ch01;


public class UnderscoreCharacter {

	public static void main(String [] args) {
		int million1 = 1000000;
		int million2 = 1_000_000;

		
		double notAtStart = _1000.00;  		// NOT COMPILES
		double notAtEnd = 1000.00_;    		// NOT COMPILES
		double notByDecimal = 1000_.00; 	// NOT COMPILES
		double annoyingButLegal = 1_00_0.0_0;   // Ugly, but compiles
		double reallyUgly = 1________2;         // Also, compiles

	}
}
