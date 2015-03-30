package fizz.buzz.whizz.fizzbuzz;

public class DivisibleBy7 implements GameRule {

	@Override
	public boolean match(int number) {
		return number % 7 == 0;
	}

	@Override
	public String result() {
		return "Whizz";
	}

}
