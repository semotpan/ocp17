package book.ch01;


public class InitializingVariables {

	public static void main(String [] args) {
		
		System.out.println("Hello");
	}

	
	static void usageOfLocalFinalVarialbles() {

		final int y = 10;
		int x = 20;

		y = x + y;
	}

	static void primitiveInitWithNull () {
		
		final int [] favoriteNumbers = new int[10];

		favoriteNumbers[0] = 100;
		favoriteNumbers[1] = 4;
		favoriteNumbers[2] = null;
		
	}

	static int localNotValid() {

		int y = 10;
		int x;
		int replay = x + y;  // DOES NOT COMPILES
		return replay;
	}

	static int valid() {

		int y = 10;
		int x;
		x = 3;
		int z;
		int replay = x + y;

		return replay;

	}
}
