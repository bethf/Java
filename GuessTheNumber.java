import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	private static final String EQUALS = "Yes! You guessed the number in %d tries.";
	private static final String LOWER_THAN = "No, the number is lower than that";
	private static final String HIGHER_THAN = "No, the number is higher than that";
	static int numberGuessed;
	static int timesGuessed = 0;

	public static void main(String[] args) {
		System.out
				.println("I'm thinking of a number between 1 and 99. Can you guess it?");
		int randomNumber = generateRandomNumber();
		getGuess(randomNumber);

	}

	public static void getGuess(int randomNumber) {
		System.out.println("What's your guess? ");
		numberGuessed = new Scanner(System.in).nextInt();
		timesGuessed++;
		System.out
				.println(checkGuess(randomNumber, timesGuessed, numberGuessed));
		getGuess(randomNumber);
	}

	static int generateRandomNumber() {
		return new Random().nextInt(100);
	}

	public static String checkGuess(int randomNumber, int guesses,
			int numberGuessed) {
		if (numberGuessed < randomNumber) {
			return HIGHER_THAN;
		}
		if (numberGuessed > randomNumber) {
			return LOWER_THAN;
		}
		return String.format(EQUALS, guesses);
	}

}
