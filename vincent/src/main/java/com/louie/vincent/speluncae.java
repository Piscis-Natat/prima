package com.louie.vincent;
//import junit.framework.*;
//import junit.framework.*; name = new ();
//import junit.framework.*;
import org.junit.Assert;
import org.junit.Test;
//import junit.framework.Assert;
public class speluncae {

	protected int value1, value2;
	   
	   // assigning the values
	   public void setUp(){
	      value1 = 3;
	      value2 = 3;
	      
	      Assert.assertFalse(false);
	   }
	   @Test
	   // test method to add two values
	   public void testAdd(){
		   System.out.print("NOTHING");
			speluncae s = new speluncae();
			s.setUp();
			//s.testAdd();
		
	      double result = s.value1 + s.value2;
	      System.out.print(result);
	      Assert.assertTrue(result == 5);
	   }
	
	
	
}
