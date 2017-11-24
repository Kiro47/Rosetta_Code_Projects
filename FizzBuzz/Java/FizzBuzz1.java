/*
* @author James Helm
* @since 11/23/17
*/
public class FizzBuzz1 {
	

	/**
	* Basic expected Fizzbuzz program with nothing special about it
	*
	*@param args Default string args 
	*
	*
	*/
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
