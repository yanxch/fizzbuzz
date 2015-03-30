package fizz.buzz.whizz.fizzbuzz;
public class DivisibleBy3 implements GameRule{

	@Override
	public boolean match(int number) {
		return number % 3 == 0;
	}

	@Override
	public String result() {
		return "Fizz";
	}

}
