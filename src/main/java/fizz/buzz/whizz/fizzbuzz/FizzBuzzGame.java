package fizz.buzz.whizz.fizzbuzz;
import java.util.List;


public class FizzBuzzGame {

	private static final List<GameRule> rules = GameRulesFactory.createGameRules();
	
	public static String askNumber(int number) {
		for (GameRule rule : rules) {
			if(rule.match(number)) {
				return rule.result();
			}
		}
		return String.valueOf(number);
	}

	public static void main(String... args) {
		for(int i = 1; i <= 100; i++) {
			System.out.println(FizzBuzzGame.askNumber(i));
		}
	}
}
