package com.zensar.main;
import java.util.logging.Level;
import com.zensar.enums.Levels;


public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ch = 10;
		do {
			Levels l1 = Levels.randomLevel();
			switch (l1) {
			case LOW:
				System.out.println("the low case");
				break;
			case MEDIUM:
				System.out.println("the medium case");
				break;
			case HIGH:
				System.out.println("the high case");
				break;
			default:
				System.out.println("default case");
				break;
			}
			ch--;
		} while (ch>0);
		
	}
	

}
