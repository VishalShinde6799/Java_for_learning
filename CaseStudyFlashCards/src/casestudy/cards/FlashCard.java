package casestudy.cards;

public class FlashCard extends Card {

	public FlashCard(String subject, String question, String answer) {
		setSubject(subject);
		setQuestion(question);
		setAnswer(answer);
	}

	public void displayCard(int i) {
		
		System.out.println(
				"FlashCard " +i+ ":: \n Subject= " + getSubject() + "\n Question= " + getQuestion() + "\n Answer= " + getAnswer());
	}

}
