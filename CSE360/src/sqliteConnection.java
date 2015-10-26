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
}
