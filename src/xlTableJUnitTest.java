import static org.junit.Assert.*;

import org.junit.Test;

public class xlTableJUnitTest {

	@Test
	public void test() {
		xlTable t1= new xlTable(12);
		
		assertTrue("Table not available", t1.bookxlTable(11, (float)12.5));
		assertFalse("Table available", t1.bookxlTable(10, (float)12.5));
		assertTrue("Table not available", t1.bookxlTable(13, (float)15.5));
		assertFalse("Table available", t1.bookxlTable(15, (float)16.5));
		assertTrue("Table not available", t1.bookxlTable((float)16.5, (float)20));
		assertFalse("Table available", t1.bookxlTable((float)18.5, 19));
		assertFalse("Table available", t1.bookxlTable(22, (float)24));
		assertFalse("Table available", t1.bookxlTable(14, (float)16));
		assertFalse("Table available", t1.bookxlTable(11, (float)13));
	}

}
