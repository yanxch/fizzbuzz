package fizz.buzz.whizz.fizzbuzz;

public class DivisibleBy3And5 implements GameRule {

	@Override
	public boolean match(int number) {
		return (number % 3 == 0) && (number % 5 == 0);
	}

	@Override
	public String result() {
		return "FizzBuzz";
	}

}
