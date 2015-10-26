import java.sql.*;
import javax.swing.*;
public class sqliteConnection {
	
	
	public static Connection dbConnector()
	{
		//======================
		//0.) Starts Database
		//======================
		try
		{
			Class.forName("org.sqlite.JDBC");
			Connection c = DriverManager.getConnection("jdbc:sqlite:ipims.db");
			System.out.println("Opened DB successfully");
			return c;
			
		}
		catch (Exception e)	
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
			return null;
		}		
	}
	public void dbInit() throws SQLException
	{
		Statement stmt;
		
		stmt = Frames.con.createStatement();
		
		String sql = "CREATE TABLE COMPANY" +
					"(ID INT PRIMARY KEY NOT NULL)";
		stmt.executeUpdate(sql);
		stmt.close();
		Frames.con.close();
	}
}
