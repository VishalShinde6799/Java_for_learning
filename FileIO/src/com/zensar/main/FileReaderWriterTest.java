package com.zensar.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("mydir/hello.txt");
			fw = new FileWriter("copy.txt", true);
			int data = 0;
			while ((data = fr.read()) != -1) {
				fw.write((char) data);

			}
			System.out.println("data copied successfully");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		finally {
			try {
				if(fr!=null)
					fr.close();
				if(fw!=null)
					fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
