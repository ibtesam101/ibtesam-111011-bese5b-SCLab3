import static org.junit.Assert.*;

import org.junit.Test;

public class TableJUnitTest {

	@Test
	public void test() {
		Table t1= new Table(8);
		
		assertTrue("Table not available", t1.bookTable(11, "A"));
		assertFalse("Table available", t1.bookTable(10, "b"));
		assertTrue("Table not available", t1.bookTable(13, "as"));
		assertTrue("Table not available", t1.bookTable(15, "casjc"));
		assertTrue("Table not available", t1.bookTable((float)17.5, "ea"));
		assertFalse("Table available", t1.bookTable((float)18.5, "cwr"));
		assertFalse("Table available", t1.bookTable(22, "dude"));
		assertFalse("Table available", t1.bookTable(14, "why"));
		assertFalse("Table available", t1.bookTable(11, "okay"));
	}

}
