import static org.junit.Assert.*;

import org.junit.Test;

public class TableJUnitTest {

	@Test
	public void test() {
		Table t1= new Table(8);
		
		assertTrue("Table not available", t1.bookTable(11));
		assertFalse("Table available", t1.bookTable(10));
		assertTrue("Table not available", t1.bookTable(13));
		assertTrue("Table not available", t1.bookTable(15));
		assertTrue("Table not available", t1.bookTable((float)17.5));
		assertFalse("Table available", t1.bookTable((float)18.5));
		assertFalse("Table available", t1.bookTable(22));
		assertFalse("Table available", t1.bookTable(14));
		assertFalse("Table available", t1.bookTable(11));
	}

}
