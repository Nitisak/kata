import static org.junit.Assert.*;

import org.junit.Test;


public class RomanClockTest {

	@Test
	public void RomanCase_input1_should_return_I() {
		RomanClock myClock = new RomanClock();
		assertEquals("I", myClock.ConvertToRoman(1));
	}
	
	@Test
	public void RomanCase_input2_should_return_II() {
		RomanClock myClock = new RomanClock();
		assertEquals("II", myClock.ConvertToRoman(2));
	}

	@Test
	public void RomanCase_input3_should_return_III() {
		RomanClock myClock = new RomanClock();
		assertEquals("III", myClock.ConvertToRoman(3));
	}
	
	@Test
	public void RomanCase_input4_should_return_IV(){
		RomanClock myClock = new RomanClock();
		assertEquals("IV", myClock.ConvertToRoman(4));
	}
	
	@Test
	public void RomanCase_input5_should_return_V(){
		RomanClock myClock = new RomanClock();
		assertEquals("V", myClock.ConvertToRoman(5));
	}
	
	@Test
	public void RomanCase_input6_should_return_VI(){
		RomanClock myClock = new RomanClock();
		assertEquals("VI", myClock.ConvertToRoman(6));
	}
	
	@Test
	public void RomanCase_input7_should_return_VII(){
		RomanClock myClock = new RomanClock();
		assertEquals("VII", myClock.ConvertToRoman(7));
	}
	
	@Test
	public void RomanCase_input8_should_return_VIII(){
		RomanClock myClock = new RomanClock();
		assertEquals("VIII", myClock.ConvertToRoman(8));
	}
	
	@Test
	public void RomanCase_input9_should_return_IX(){
		RomanClock myClock = new RomanClock();
		assertEquals("IX", myClock.ConvertToRoman(9));
	}
	
	@Test
	public void RomanCase_input10_should_return_X(){
		RomanClock myClock = new RomanClock();
		assertEquals("X", myClock.ConvertToRoman(10));
	}
	
	@Test
	public void RomanCase_input11_should_return_XI(){
		RomanClock myClock = new RomanClock();
		assertEquals("XI", myClock.ConvertToRoman(11));
	}
	
	@Test
	public void RomanCase_input12_should_return_XII(){
		RomanClock myClock = new RomanClock();
		assertEquals("XII", myClock.ConvertToRoman(12));
	}
	
	@Test
	public void RomanCase_input0_should_return_error(){
		RomanClock myClock = new RomanClock();
		assertEquals("ERR", myClock.ConvertToRoman(0));
	}
	
	@Test
	public void RomanCase_input13_should_return_error(){
		RomanClock myClock = new RomanClock();
		assertEquals("ERR", myClock.ConvertToRoman(13));
	}
	
}
