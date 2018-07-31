package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	private int value1;
	private int value2;

	@Before
	public void setUp() throws Exception {
		  value1 = 2;
		  value2 = 1;
	}

	@Test
	public  void testAdd() {
		int expectedResult = 3;
		int actualResult;
		Calc calcObj = new Calc();
		
		actualResult = calcObj.add(value1, value2);
		
		assertEquals(expectedResult,actualResult);
}
	
	@Test
	public  void testSub() {
		int expectedResult = 1;
		int actualResult;
		Calc calcObj = new Calc();
		
		actualResult = calcObj.sub(value1, value2);
		
		assertEquals(expectedResult,actualResult);
}
	
	@SuppressWarnings("deprecation")
	@Test
	public  void testDiv() {
		int expectedResult = 2;
		int actualResult;
		Calc calcObj = new Calc();
		
		
		actualResult = calcObj.div(value1, value2);
		
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public  void testMultiply() {
		int expectedResult = 2;
		int actualResult;
		Calc calcObj = new Calc();
		
		actualResult = calcObj.multiply(value1, value2);
		
		assertEquals(expectedResult,actualResult);
}

}
