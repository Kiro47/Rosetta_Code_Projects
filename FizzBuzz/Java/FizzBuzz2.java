
/**
* @author James Helm
*
* @since 11/23/17
*/
public class FizzBuzz2{
	
	/**
	* Main method of any java programs
	*
	* @param args Default main arguments input at runtime
	*/
	public static void main(String[] args) {
	
	FizzBuzz2 selfClass = new FizzBuzz2();
	
		if (!(args.length >= 2)) {
			System.out.println("Syntax: FizzBuzz2 [valueFrom] [valueTo]" );
			return;
		}
		int valueFrom = 0;
		int valueTo = 0;
		try {
		valueFrom = Integer.parseInt(args[0]);
		valueTo = Integer.parseInt(args[1]);
		}
		catch(NumberFormatException exception) {
		System.out.println("Both arguments must be integers!");
		return;
		}
		if (valueFrom > valueTo) {
                        System.out.println(valueFrom + " is greater than " + valueTo + "!");
                        System.out.println("Respecify parameters, valueFrom should be lower than ValueTo");
                        System.out.println("Syntax: FizzBuzz2 [valueFrom] [valueTo]" );
                        return;
                }

		selfClass.fizzBuzzTask(valueFrom, valueTo);
	}

	/**
	* Perfoms FizzBuzz
	* Prints out Fizz for any number divisableby 3
	* and then prints out Buzz for any divisable by 5.,
	* If divisable by both then it prints FizzBuzz
	* 
	* @param valueFrom Performs Fizzbuzz starting at this value
	* @param valueTo Performs FizzBuzz up to this number range
	*/
	public void fizzBuzzTask(int valueFrom, int valueTo) {
                int i = valueFrom;
                while (i <= valueTo) {
                        switch (i % 15) {
                        case 0:
                                System.out.println("FizzBuzz");
                                break;
                        case 5: buzz(); break;
                        case 10:buzz(); break;
                        case 3: fizz(); break;
                        case 6: fizz(); break;
                        case 9: fizz(); break;
                        case 12:fizz(); break;
                        default:
                                System.out.println(i);
                                break;
                        }
			i++;
                }

	}

	
	/**
	* Prints out the word "Fizz"
	*/
	public void fizz() {
	System.out.println("Fizz");
	}
	
	/**
	* Prints out the word "Buzz"
	*/
	public void buzz(){ 
	System.out.println("Buzz");
	}
}
