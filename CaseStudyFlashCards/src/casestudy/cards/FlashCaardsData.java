package casestudy.cards;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import casestudy.interfaces.CardSearchable;

public class FlashCaardsData implements CardSearchable {

	@Override
	public Card searchCard(String sub) {

		return null;
	}

	public void loadData() {

		FileInputStream fis = null;
		try {

			fis = new FileInputStream("cards_data.txt");

			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.print((char) data);
			}

			System.out.println("File read successfully");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
		}

	}

}
