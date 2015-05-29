import static org.junit.Assert.*;

import org.junit.Test;


public class BinaryStringTest {

	@Test
	public void testLengt() {
		BinaryString bitsetA = new BinaryString(10);
		BinaryString bitsetB = new BinaryString("0110010010");
		
		assertEquals(10,bitsetA.length());
		assertEquals(10,bitsetB.length());
	}

}
