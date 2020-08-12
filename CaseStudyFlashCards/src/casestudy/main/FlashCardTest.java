package casestudy.main;

import java.util.ArrayList;
import java.util.Scanner;
import casestudy.cards.FlashCard;

public class FlashCardTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<FlashCard> f = new ArrayList<FlashCard>();
		System.out.println("how many cards do you want..?");

		int count = sc.nextInt();

		for (int i = 0; i < count; i++) 
		{
			System.out.println("enter a subject");
			String subject = sc.next();
			System.out.println("Enter the question");
			String question = sc.next();
			System.out.println("enter an answer: ");
			String answer = sc.next();
			f.add(new FlashCard(subject, question, answer));
		}

		for (FlashCard flashCard : f) {
			int i=1;
			flashCard.displayCard(i);
			i++;
		}

	}

}
