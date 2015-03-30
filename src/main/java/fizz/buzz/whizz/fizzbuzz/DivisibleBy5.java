package fizz.buzz.whizz.fizzbuzz;

public class DivisibleBy5 implements GameRule {

	@Override
	public boolean match(int number) {
		return number % 5 == 0;
	}

	@Override
	public String result() {
		return "Buzz";
	}

}
