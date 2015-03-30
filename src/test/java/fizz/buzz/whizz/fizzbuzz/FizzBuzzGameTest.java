package fizz.buzz.whizz.fizzbuzz;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class FizzBuzzGameTest {
	
	@Test
	public void whenPupilOneAskedThenAnswerIsOne() {
		String answer = FizzBuzzGame.askNumber(1);
		assertThat(answer, is("1"));
	}
	
	@Test
	public void whenPupilTwoAskedThenAnswerIsTwo() {
		String answer = FizzBuzzGame.askNumber(2);
		assertThat(answer, is("2"));
	}
	
	@Test
	public void whenPupilThreeAskedThenAnswerIsFizz() {
		String answer = FizzBuzzGame.askNumber(3);
		assertThat(answer, is("Fizz"));
	}
	
	@Test
	public void whenPupilFiveAskedThenAnswerIsBuzz() {
		String answer = FizzBuzzGame.askNumber(5);
		assertThat(answer, is("Buzz"));
	}
	
	@Test
	public void whenPupilSixIsAskedThenAnswerIsFizz() {
		String answer = FizzBuzzGame.askNumber(6);
		assertThat(answer, is("Fizz"));
	}
	
	@Test
	public void whenPupilFifteenIsAskedAnswerIsFizzBuzz() {
		String answer = FizzBuzzGame.askNumber(15);
		assertThat(answer, is("FizzBuzz"));
	}
	
	@Test
	public void whenPupilSevenIsAskedAnswerIsWhizz() {
		String answer = FizzBuzzGame.askNumber(7);
		assertThat(answer, is("Whizz"));
	}
}
