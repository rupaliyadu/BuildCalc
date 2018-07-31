package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcTest {
	
	private int value1;
	private int value2;

	@Before
	public void setUp() throws Exception {
		  value1 = 1;
		  value2 = 2;
	}

	@Test
	public  void testAdd() {
		int expectedResult = 3;
		int actualResult;
		Calc calcObj = new Calc();
		
		actualResult = calcObj.add(value1, value2);
		
		assertEquals(expectedResult,actualResult);
}

}
