
public class FizzBuzz {

	public static void main(String[] args) {
		performFizzBuzzMagic();
	}

	private static void performFizzBuzzMagic() {
		for(int i = 1; i <= 100; i++) {
			String iString = Integer.toString(i);
			
			if((i % 3 == 0 && i % 5 == 0) ||(iString.contains("3") && iString.contains("5"))) {
				System.out.println("Fizz Buzz");
				
			}else if(i % 3 == 0 || iString.contains("3")) {
				System.out.println("Fizz");
		
			}else if(i % 5 == 0 || iString.contains("5")) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}

	}

