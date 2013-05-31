import static org.junit.Assert.*;

import org.junit.Test;


public class CalculatorTest {

	@Test
	public void testNullObject() {
		Calculator a= new Calculator();
		assertTrue(a.Add("")==0);
	}
	
	@Test
	public void testEmptyString() {
		Calculator a= new Calculator();
		assertTrue(a.Add("")==0);
	}

	@Test
	public void testWithOneNumber() {
		Calculator a= new Calculator();
		Calculator b= new Calculator();
		assertTrue(a.Add("1")==1);
		assertTrue(b.Add("1,2")==3);	
		}
//	
	@Test
	public void testTwoNumber() {
		Calculator a= new Calculator();
		assertTrue(a.Add("1,2")==3);
	}
//	
	@Test
	public void testUnknownNumber() {
		Calculator a= new Calculator();
		assertTrue(a.Add("1,2,3,4")==10);
	}
//	
	@Test
	public void testNewlinesBetweenNumbers() {
		Calculator a= new Calculator();
		assertTrue(a.Add("1\n2,3\n4")==10);
	}
	
	@Test
	public void testDelimiterDefine() {
		Calculator a= new Calculator();
		assertTrue(a.Add("//[;]\n1;2")==3);
	}
	
	@Test
	public void testDelimiterDefinedAndDefault() {
		Calculator a= new Calculator();
		assertTrue(a.Add("//[;]\n1;2,3\n4")==10);
	}
	
	@Test
	public void testNegativeNumber() {
		Calculator a= new Calculator();
		try {
			a.Add("//;\n1;-2,3\n4");
		} catch (Exception e) {
			// TODO: handle exception
			assertTrue(e.getMessage().equals("negatives not allowed"));
		}
	}
	
	@Test
	public void testNumberBigThan1000() {
		Calculator a= new Calculator();
		assertTrue(a.Add("//[;]\n1;2,3000\n4")==7);
	}
//	@Test
//	public void testMultiDelimiter() {
//		Calculator a= new Calculator();
//		assertTrue(a.Add("//[;][abc]\n1;2,3000\n4")==7);
//	}
}
