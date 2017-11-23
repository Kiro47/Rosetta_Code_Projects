
public class FizzBuzz1 {
	
	public static void main(String[] args) {
		
		// Basic example from 1-100 inclusive
		for (int i = 1; i <= 100; i++) {
			String output = "";
			if (i % 15 == 0) {
			output = "FizzBuzz";
			}
			else if(i % 3 == 0) {
			output = "Fizz";
			}
			else if (i % 5 == 0) {
			output = "Buzz";
			}
			else {
			output = Integer.toString(i);
			}
			// Outputs result on new line
			System.out.println(output);
		}
	}
}
