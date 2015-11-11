package com.algos;

import java.awt.Point;

public class NisumTest3 {
	
	public static void tricky(Point arg1, Point arg2)
	{
	  arg1.x = 100;
	  arg1.y = 100;
	  Point temp = arg1;
	  arg1 = arg2;
	  arg2 = temp;
	  System.out.println(">X: " + arg1.x + " Y:" + arg1.y); 
	  System.out.println("X: " + arg2.x + " Y: " +arg2.y);  
	  System.out.println(" ");
	}
	public static void main(String [] args)
	{
	  Point pnt1 = new Point(0,0);
	  Point pnt2 = new Point(0,0);
	  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
	  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
	  System.out.println(" ");
	  tricky(pnt1,pnt2);
	  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
	  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);  
	  System.out.println(" ");
	  
	  Object uno=1;
	  Object dos=2;
	  badSwap(uno,dos);
	  System.out.println("uno " + uno + " dos " +dos);  
	}
	
	public static void badSwap(Object var1, Object var2)
	{
	  Object temp = var1;
	  var1 = var2;
	  var2 = temp;
	  System.out.println("var1 " + var1 + " var2 " +var2);  
	}

}
