#NUMBER GUESSING GAME
import java.util.Scanner;
public class Task2{
	public static void guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100* Math.random());
		int i, guess,K=5;
		System.out.println("Choose a lucky number "+ " between 1 to 100."+ "\nGuess that number"+ " within 5 trials.");
		for (i = 0;i < K; i++) {
			System.out.println("Guess the lucky number:");
			guess = sc.nextInt();
			if (number == guess) {
				System.out.println("Congratulations! "+ " You guessed the lucky number.");
				break;
			}
			else if (number > guess && i != K - 1) {
				System.out.println("Number is "+ ">" + guess);
			}
			else if (number < guess && i != K - 1) {
				System.out.println("Number is"+ "<" + guess);
			}
		}

		if (i == K) {
			System.out.println("No more Chances \n"+K+" trials are completed.");
			System.out.println("The lucky number is " + number);
		}
	}
	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}
