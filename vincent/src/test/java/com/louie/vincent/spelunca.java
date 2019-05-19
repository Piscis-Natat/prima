package com.louie.vincent;
import com.louie.vincent.speluncae;
//import junit.framework.*;
//import junit.framework.*; name = new ();
//import junit.framework.*;
import org.junit.Assert;
import org.junit.Test;
//import junit.framework.Assert;
public class spelunca {

	protected int value1, value2;
	   @Test
	   // assigning the values
	   public void setUp(){
	      value1 = 3;
	      value2 = 3;
	      speluncae j = new speluncae();
	      Assert.assertFalse(false);
	   }
	   @Test
	   public void testString(){
		 Assert.assertSame(5, 5);  
		   
	   }
	   @Test
	   // test method to add two values
	   public void testAdd(){
		   System.out.print("NOTHING");
			spelunca s = new spelunca();
			s.setUp();
			//s.testAdd();
		
	      double result = s.value1 + s.value2;
	      System.out.print(result);
	      Assert.assertTrue(result == 6);
	   }
	
	
	
}
