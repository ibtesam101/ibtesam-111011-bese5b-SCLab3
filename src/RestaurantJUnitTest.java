import static org.junit.Assert.*;

import org.junit.Test;

public class RestaurantJUnitTest {

	@Test
	public void test() {
		Restaurant r1 = new Restaurant();
		
		for(int i = 0; i < 15; i++)
			assertTrue("No table available", r1.reserve(2, 11));
		
		assertFalse("Table available", r1.reserve(2, 11));

		assertFalse("Table available", r1.reserve(4, 11));
		
		assertTrue("No table available", r1.reserve(4, 14));
		assertTrue("No table available", r1.reserve(5, 13));
		assertTrue("No table available", r1.reserveXL(12, 16));
	}

}
