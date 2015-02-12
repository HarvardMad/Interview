
public class Remainder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int numOne;
		int numTwo;
		int dividesInto, remain;
		
		numOne = 10;
		numTwo = 3;
		dividesInto= numOne/numTwo;
		remain = numOne % numTwo;
		
		System.out.println("divides in to " + dividesInto + " times and remainder is " + remain );
	}

}
