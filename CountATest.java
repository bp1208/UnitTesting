import static org.junit.Assert.*;

import org.junit.Test;

public class CountATest {

	@Test
	public void test() {
		UnitTesting test=new UnitTesting();
		int output=test.count("hello");
		assertEquals(0, output);
	}

}
