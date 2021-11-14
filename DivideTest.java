import static org.junit.Assert.*;

import org.junit.Test;

public class DivideTest {

	
	@Test
	public void test1() {
		UnitTesting test=new UnitTesting();
		double output=test.divide(6,3);
		assertEquals(2.0, output,0.00001);
	}
	
	@Test
	public void test2() {
		UnitTesting test=new UnitTesting();
		double output=test.divide(-6,3);
		assertEquals(-2.0, output,0.00001);
	}
	
}
