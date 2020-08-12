package com.zensar.main;

import java.util.Scanner;

import com.zensar.card.Card;
import com.zensar.card.FlashCardsData;
import com.zensar.exception.CardNotFoundException;

public class FlashCardTest extends Thread
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		FlashCardsData f=new FlashCardsData();
		f.loadData();
		f.insertData();
		
		System.out.println("Enter Card to Searched:- ");
		String s=sc.next();
		try 
		{
			Card c = f.searchCard(s);
			Thread t1 =new Thread();
			t1.start();
			System.out.println("FrontSide:- ");
			System.out.println("Subject:- "+c.getSubject());
			System.out.println("Question:- "+c.getQuestion());
			t1.sleep(10000);
			System.out.println("BackSide:- ");
			System.out.println("Answer:- "+c.getAnswer());
		} 
		catch (CardNotFoundException e) 
		{
			//e.printStackTrace();
			//System.out.println(e);
			System.err.println(e.getErrmsg());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();

	}

}
