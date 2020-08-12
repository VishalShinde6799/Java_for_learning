package com.zensar.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Characters are read and wrote as unicode character encoded symbols

public class FileCopyTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("mydir/hello.txt");
			fos = new FileOutputStream("mydir/dataout.txt");
			int data = 0;
			while ((data = fis.read()) != -1) {
				fos.write((char) data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		System.out.println("file copied successfully");
	}

}
