import static org.junit.Assert.assertEquals;

import org.junit.Test; 
public class NumberToWordsConverterTest {

	@Test
	public void test() {
		assertEquals("Four",NumberToWordsConverter.convert("4"));  
		
	}
	
	@Test
	public void test1() {
		assertEquals("Two Hundred Thirty Nine",NumberToWordsConverter.convert("239"));  
		
	}
	
	@Test
	public void test2() {
		assertEquals("Five Thousand Four Hundred Eighty Nine",NumberToWordsConverter.convert("5489"));  
		
	}
	
	@Test
	public void test3() {
		assertEquals("Seventy Four Thousand Five Hundred Twenty One",NumberToWordsConverter.convert("74521"));  
		
	}
	
	@Test
	public void test4() {
		assertEquals("Six Lakh Fifty Four Thousand One Hundred Twenty Three",NumberToWordsConverter.convert("654123"));  
		
	}
	
	
	
}
