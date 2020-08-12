package com.zensar.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("mydir/hello.txt");
			int data = 0;
			while ((data =  fis.read()) != -1) {
				System.out.print((char)data);
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
