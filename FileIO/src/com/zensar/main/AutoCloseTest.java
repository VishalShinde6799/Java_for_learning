package com.zensar.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AutoCloseTest {
	public static void main(String[] args) {
		try
		(
				FileReader fr = new FileReader("mydir/hello.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("copy3.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
		)
		{
			String data =null;
			while((data= br.readLine())!=null)
			{
				bw.write(data);
				bw.newLine();
				pw.println(data);
			}
			System.out.println("File copied successfully");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
