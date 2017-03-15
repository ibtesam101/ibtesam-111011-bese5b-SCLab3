import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaffLogin {
	String username;
	String password;
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/ibtesamlabreservation";

	   //  Database credentials
	static final String USER = "root";
	static final String PASS = "root";
	   
	
	public StaffLogin(String u, String p){
		this.username = u;
		this.password = p;
	}
	
	public boolean Authenticate() throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		String sql;
	    sql = "SELECT userName, userPassword FROM staff where userName='"+username+
	    		"' and userPassword='"+this.password+"';";
	    ResultSet rs = null;
	    
	    try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    if(!rs.next()){
		    rs.close();
		    stmt.close();
		    conn.close();
	    	return false;
 	    }
	    else{
		    rs.close();
		    stmt.close();
		    conn.close();
	    	return true;
	    }    
	}
	
	public void addToDatabase() throws SQLException{
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		String sql;
	    sql = "INSERT INTO staff(userName, userPassword) values ('"+username+
	    		"','"+this.password+"');";
	    
	    try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    stmt.close();
	    conn.close();
	    
	}
	
}

