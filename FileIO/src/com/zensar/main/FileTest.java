package com.zensar.main;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args)  {
		File dir = new File("mydir");
		File newName= new File("Welcome.txt");
		System.out.println("Directory Created "+ dir.mkdir());
		File file = new File(dir, "hello.txt");
		try {
			System.out.println("file created: " +file.createNewFile());
			file.renameTo(newName);
			System.out.println("file: "+newName.getName()+" deleted "+ newName.delete());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
