import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class staffLoginTest {

	@Test
	public void test() throws SQLException {
    	StaffLogin user = new StaffLogin("pie", "pie");

    	StaffLogin user2 = new StaffLogin("timmy2", "timmy2");
    	
    	assertTrue("User not in db", user.Authenticate());

    	assertFalse("User in db", user2.Authenticate());
	}

}
