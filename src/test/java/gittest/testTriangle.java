package gittest;

import junit.framework.Assert;
import org.junit.*;

public class testTriangle{
	
	@Test
	public void isTriangleTest1(){
		Triangle t = new Triangle(4, 0, 4);
		
		boolean expResult = false;
		boolean actResult = t.isTriangle();
		Assert.assertEquals("When A = 4, B = 0, C = 4, it is not a triangle", expResult, actResult); 
		
	}
	
	@Test
	public void isTriangleTest2(){
		Triangle t = new Triangle(3, 5, 5);
		
		boolean expResult = true;
		boolean actResult = t.isTriangle();
		Assert.assertEquals("When A = 3, B = 5, C = 5, it is a triangle", expResult, actResult);
	}
	
	@Test
	public void typeTest1(){
		Triangle t = new Triangle(5, 4, 3);
		
		String expResult = "Right Triangle";
		String actResult = t.type();
		Assert.assertEquals("When A = 3, B = 4, C = 5, it is a Right Triangle", expResult, actResult);	
	}
	
	@Test
	public void typeTest2(){
		Triangle t = new Triangle(9, 10, 9);
		
		String expResult = "Acute Triangle";
		String actResult = t.type();
		Assert.assertEquals("When A = 9, B = 10, C = 9, it is a Acute Triangle", expResult, actResult);	
	}

	@Test
	public void typeTest3(){
		Triangle t = new Triangle(3, 6, 5);
		
		String expResult = "Obtuse Triangle";
		String actResult = t.type();
		Assert.assertEquals("When A = 3, B = 6, C = 5, it is a Obtuse Triangle", expResult, actResult);	
	}
	
	@Test
	public void typeTest4(){
		Triangle t = new Triangle(6, 3, 2);
		
		String expResult = "Not A Triangle";
		String actResult = t.type();
		Assert.assertEquals("When A = 6, B = 3, C = 2, it is not a Triangle", expResult, actResult);
	}
	
}
