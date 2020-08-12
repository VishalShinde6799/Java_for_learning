package com.zensar.interfaces;

import com.zensar.card.Card;
import com.zensar.exception.CardNotFoundException;

public interface CardSearchable 
{
	public Card searchCard(String sub) throws CardNotFoundException;
}
