import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void test() {
		UnitTesting test=new UnitTesting();
		int output=test.square(6);
		assertEquals(36, output);
	}

}
