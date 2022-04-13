/*
 * Original assignment: print numbers 1-100; if number is divisible by or contains a 3, print "Fizz"; if
 * number is divisible by or contains 5, print "Buzz"; if number is (divisible by 3 AND 5) or
 * (contains a 3 AND 5) print "Fizz Buzz"
 * 
 *  Modification: since some numbers meet multiple conditions, print true or false for each condition per number
 */

public class FizzBuzz {

	public static void main(String[] args) {
		performFizzBuzzMagic();
	}

	private static void performFizzBuzzMagic() {
		System.out.printf("%-8s%-22s%-22s%-22s%-22s%-22s", "No.", "Contains or /3", "Contains or /5",
				"Divisible 3 And 5", "Contains 3 And 5", "Number of True");
		for (int i = 1; i <= 100; i++) {
			boolean containsOrDivisibleBy3 = false; // need to reset to false each time
			boolean containsOrDivisibleBy5 = false; // need to reset to false each time
			boolean isDivisibleBy3And5 = false; // need to reset to false each time
			boolean contains3And5 = false; // need to reset to false each time
			int trueCount = 0; // need to reset to zero each time
			String iString = Integer.toString(i);

			if ((i % 3 == 0) || iString.contains("3")) {
				containsOrDivisibleBy3 = true;
			}

			if (i % 5 == 0 || iString.contains("5")) {
				containsOrDivisibleBy5 = true;
			}

			if (i % 3 == 0 && i % 5 == 0) {
				isDivisibleBy3And5 = true;
			}
			if (iString.contains("3") && iString.contains("5")) {
				contains3And5 = true;
			}

			trueCount = (containsOrDivisibleBy3 ? 1 : 0) + (containsOrDivisibleBy5 ? 1 : 0)
					+ (isDivisibleBy3And5 ? 1 : 0) + (contains3And5 ? 1 : 0);

			System.out.printf("%n%-8s%-22s%-22s%-22s%-22s%-22s", iString, containsOrDivisibleBy3,
					containsOrDivisibleBy5, isDivisibleBy3And5, contains3And5, trueCount);
		}
	}

}
