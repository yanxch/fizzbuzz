package fizz.buzz.whizz.fizzbuzz;
import java.util.ArrayList;
import java.util.List;


public class GameRulesFactory {

	public static List<GameRule> createGameRules() {
		List<GameRule> rules = new ArrayList<>();
		rules.add(new DivisibleBy3And5());
		rules.add(new DivisibleBy3());
		rules.add(new DivisibleBy5());
		rules.add(new DivisibleBy7());
		return rules;
	}
}
