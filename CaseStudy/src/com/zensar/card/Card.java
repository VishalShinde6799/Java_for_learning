package com.zensar.card;

public abstract class Card 
{
	private String subject; 
	private String question; 
	private String answer;
	
	public Card() 
	{
		subject=" ";
		question=" ";
		answer=" ";
		
	}
	
	
	public Card(String subject, String question, String answer) 
	{
		super();
		this.subject = subject;
		this.question = question;
		this.answer = answer;
	}


	public String getSubject() 
	{
		return subject;
	}
	
	public void setSubject(String subject) 
	{
		this.subject = subject;
	}
	
	public String getQuestion() 
	{
		return question;
	}
	
	public void setQuestion(String question) 
	{
		this.question = question;
	}
	public String getAnswer() 
	{
		return answer;
	}
	
	public void setAnswer(String answer) 
	{
		this.answer = answer;
	}
	public void display()
	{
		System.out.println();
		System.out.println("Subject:: "+subject);
		System.out.println("Question:: "+question);
		System.out.println("Answer:: "+answer);
	}
	
	
}
