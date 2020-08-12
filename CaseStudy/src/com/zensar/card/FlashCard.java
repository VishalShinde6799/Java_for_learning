 package com.zensar.card;

public class FlashCard extends Card
{
	private int flashCardId;
	public FlashCard() 
	{
		super();
		flashCardId=0;
	}
	

	public FlashCard(String subject,String question,String answer,int flashId) 
	{
		super(subject,question,answer);
		this.flashCardId = flashCardId;
	}
	


	public int getFlashCardId() 
	{
		return flashCardId;
	}


	public void setFlashCardId(int flashId) 
	{
		this.flashCardId = flashId;
	}


	public void display()
	{
		super.display();
		System.out.println("FlashCArdId:: "+flashCardId);
	}
	
	

}
