package casestudy.cards.exceptions;

public class CardNotFoundException extends Exception {

	String CardMessage;

	public CardNotFoundException() {
		CardMessage="The Card You Are Looking for is not found";
	}
	public CardNotFoundException(String cardMessage) {
		super();
		CardMessage = cardMessage;
	}

	public String getCardMessage() {
		return CardMessage;
	}
}
