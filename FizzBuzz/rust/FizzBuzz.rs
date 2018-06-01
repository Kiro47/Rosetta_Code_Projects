
fn main()
{
	let max = 100;
	let min = 0;
	println!("Hello World!");

	for i in min..max+1{
		if i%15 == 0 {
			println!("{} FizzBuzz", i);
		}
		else if i%5 == 0 {
			println!("{} Buzz", i);
		}
		else if i%3 == 0 {
			println!("{} Fizz", i);
		}
		else {
			println!("{}", i);
		}
	}

}
