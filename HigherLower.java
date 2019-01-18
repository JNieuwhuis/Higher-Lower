package higherLower;
import java.util.*;

public class HigherLower {

	public static void main(String[] args) {

		Integer randomNum = 0;
		Integer count = 0;
		boolean goodAnswer = false;

		//Introduce game and set number. 
		System.out.println("I'm thinking of a number between 1 and 50.");
		System.out.println("Can you guess what it is within 10 tries?");
		randomNum = (int) ((Math.random()*50)+1);
		//System.out.println(randomNum);

		//Get user number input and give feedback.
		while ((goodAnswer == false) && (count <10)) {

			Scanner input = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int answer = input.nextInt();

			if (Integer.valueOf(answer).equals(Integer.valueOf(randomNum))) {
				System.out.println("You guessed the correct number! ");
				goodAnswer = true;
				input.close();

			}
			else if (Integer.valueOf(answer) > Integer.valueOf(randomNum)) {
				count++;
				System.out.println("My number is lower. ");

				if (count ==9) {
					System.out.println("You have " +(10-count) + " guess left.");
				}
				else if (count <10) {
					System.out.println("You have " +(10-count) + " guesses left."); 
				}
			}
			else if (Integer.valueOf(answer) < Integer.valueOf(randomNum)) {
				count++;
				System.out.println("My number is higher. ");
				if (count ==9) {
					System.out.println("You have " +(10-count) + " guess left.");
				}
				else if (count <10) {
					System.out.println("You have " +(10-count) + " guesses left."); 
				}
			}				
			else {
				System.out.println("Please enter a number between 1 and 50. ");
			}
			if (count ==10) {
			System.out.println("You couldn't guess the correct number within 10 tries! You lost! ");
			break;
			}
		
		}
	}
}
	
	// Things to work on: control the input for letters and out of bounds. Correct for numbers that already have been guessed.