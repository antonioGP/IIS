import static org.junit.Assert.*;

import org.junit.Test;


public class BinaryStringTest {

	@Test
	public void testLengt() 
	{
		BinaryString bitsetA = new BinaryString(10);
		BinaryString bitsetB = new BinaryString("0110010010");
		
		assertEquals(10,bitsetA.length());
		assertEquals(10,bitsetB.length());
	}
	
	@Test
	public void testSetBit()
	{
		BinaryString bitset = new BinaryString("100101");
		bitset.set(2, '1');
		assertEquals('1',bitset.get(2));
	}
	
	@Test(expected = BinaryStringException.class)
	public void testGetOutOfLimitBit()
	{
		BinaryString bitset = new BinaryString("0110101");
		
		bitset.get(56);
		
	}
	
	@Test(expected = BinaryStringException.class)
	public void testSetOutOfLimitBit()
	{
		BinaryString bitset = new BinaryString("0110101");
		
		bitset.set(56,'0');		
	}
	
	@Test
	public void testSetOutOfLimitBitV2()
	{
		BinaryString bitset = new BinaryString("0110101");
		
		try{
			bitset.set(56,'0');
			fail("Se esperaba BinaryStringException");
		}catch(BinaryStringException b){
			
		}		
	}
	
	@Test(expected = BinaryStringException.class)
	public void testInvalidBitValue()
	{
		BinaryString bitset = new BinaryString("0110101");
		
		bitset.set(56,'z');		
	}
	
	
}
