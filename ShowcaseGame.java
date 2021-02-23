import java.util.Scanner;
public class ShowcaseGame {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Prize[] tester = Showcase.test();
		System.out.println(tester[0].getName());
		System.out.println("Welcome to the Showcase Showdown!\n Your prizes are...");
		boolean again = true;
		do {
			Prize[] prizes = Showcase.createPrizes();
			double total = 0;
			for(int i=0;i<prizes.length;i++) {
				System.out.println(prizes[i].getName());
				total += prizes[i].getCost();
			}
			System.out.println("Guess the total without going over! Enter the guess");
			double guess = key.nextDouble();
			if(guess>total) {
				System.out.println("You went over,loser! you lose you lose hahahahahaahahhahahahah");
			}
			else if(guess<=total && guess+2000>total) {
				System.out.println("You got it buddy! WINRAR");
			}
			else {
				System.out.println("Bad guess. Bad person. That's just how it is.loser");
			}
			System.out.println("Play again? Type 'no' if ya don't");
			String input = key.nextLine();
			if(input.equalsIgnoreCase("no")) {
				again = false;
			}
		}while(again == true);
	}

}
