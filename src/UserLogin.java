import java.sql.*;

public class UserLogin {
	String username;
	String password;
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/ibtesamlabreservation";

	   //  Database credentials
	static final String USER = "root";
	static final String PASS = "root";
	   
	
	public UserLogin(String u, String p){
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
	    sql = "SELECT userName, userPassword FROM userLocal where userName='"+username+
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
	    sql = "INSERT INTO userLocal(userName, userPassword) values ('"+username+
	    		"','"+this.password+"');";
	    
	    try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    String sql2;
	    sql2 = "INSERT INTO log(userName) values('"+username+
	    		"');";
	    
	    try {
			stmt.executeUpdate(sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    stmt.close();
	    conn.close();
	    
	}
	
	public static void main(String[] args) throws SQLException{
    	UserLogin user = new UserLogin("timmy", "timmy");

    	UserLogin user2 = new UserLogin("timmy2", "timmy2");
    	
    	System.out.println(user.Authenticate());
    	System.out.println(user2.Authenticate());
    	
    	UserLogin user3 = new UserLogin("Chimmy", "Changa");
    	user3.addToDatabase();
    	
    }
}
