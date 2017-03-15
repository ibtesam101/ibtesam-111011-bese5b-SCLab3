import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class userLoginTest {

	@Test
	public void test() throws SQLException {
    	UserLogin user = new UserLogin("timmy", "timmy");

    	UserLogin user2 = new UserLogin("timmy2", "timmy2");
    	
    	assertTrue("User not in db", user.Authenticate());

    	assertFalse("User in db", user2.Authenticate());
	}

}
