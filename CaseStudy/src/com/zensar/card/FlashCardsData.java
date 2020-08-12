package com.zensar.card;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.zensar.exception.CardNotFoundException;
import com.zensar.interfaces.CardSearchable;

public class FlashCardsData extends FlashCard implements CardSearchable {
	Scanner sc = new Scanner(System.in);
	ArrayList<FlashCard> list = new ArrayList<FlashCard>();
	FlashCard flash[] = new FlashCard[5];
	String s1[]=new String[5];
	String subject[] = new String[5];
	String question[] = new String[5];
	String answer[] = new String[5];
	
	

	public void loadData() {

		try 
		{
			FileReader fr = new FileReader("mydir/cards_data.txt");
			BufferedReader br = new BufferedReader(fr);
			String data = null;
			int f=0;
			while ((data = br.readLine()) != null) 
			{				
				String s4[] = data.split(";");

				subject[f]=s4[0];
				question[f]=s4[1];
				answer[f]=s4[2];
				f++;
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertData() 
	{
		for (int i = 0; i < 5; i++) 
		{
			/*
			 * System.out.println("Enter Data of "+i+" Card:- "); //flash[i]=new
			 * FlashCard(); FlashCard f; //flash[i].setFlashCardId(i);
			 * System.out.println("Enter Subject:- "); String s=sc.nextLine();
			 * //flash[i].setSubject(s);
			 * 
			 * System.out.println("Enter Question:- "); String q=sc.nextLine();
			 * //flash[i].setQuestion(q);
			 * 
			 * System.out.println("Enter Answer:- "); String a=sc.nextLine();
			 * //flash[i].setAnswer(a);
			 */

			flash[i] = new FlashCard(subject[i], question[i], answer[i], i);
			list.add(flash[i]);
		}

	}

	@Override
	public Card searchCard(String sub)throws CardNotFoundException 
	{ 
		boolean flag1=true;
		
		for (int i = 0; i < 5; i++) 
		{
			if (subject[i].equals(sub)) 
			{
				
				System.out.println("Card found");				 
				flag1=false;
				Card c=new FlashCard(subject[i],question[i],answer[i],i);
				return c;

			}
		}
		if(flag1)
		{
			throw new CardNotFoundException("The card you are looking for is not available");

		}
		return null;
		
	}
}


