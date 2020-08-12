package com.zensar.main;

import com.zensar.shapes.Circle;
import com.zensar.shapes.Rectangle;
import com.zensar.shapes.Shape;            //reference can be created but not object

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Shape s=null;  
  s=new Rectangle();
  s.calArea();
  
  
 s= new Rectangle(10, 40);
 s.calArea();
 
 s= new Circle();
 s.calArea();
 
 s=new Circle(10);
 s.calArea();
	}                                                //reference can be null

}
