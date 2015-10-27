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
			Connection c = DriverManager.getConnection("jdbc:sqlite:Ipims.db");
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
	public static void init()
	{
	    Statement stmt = null;
	    try 
	    {
	      Class.forName("org.sqlite.JDBC");
	      Frames.con = DriverManager.getConnection("jdbc:sqlite:Ipims.db");
	      System.out.println("Opened database successfully");

	      stmt = Frames.con.createStatement();
	      
	      String sql = "CREATE TABLE IF NOT EXISTS PATIENT("
	      		+ "USERNAME TEXT NOT NULL, "
	      		+ "FIRSTNAME TEXT,"
	      		+ "LASTNAME TEXT NOT NULL,"
	      		+ "TYPE TEXT NOT NULL"
	      		+ ""
	      		+ "PRIMARY KEY(USERNAME, LASTNAME));";
	      System.out.print(sql);
	    		  
	    		  
	      stmt.executeUpdate(sql);
	      stmt.close();
	    }
	    catch ( Exception e ) 
	    {
	        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
	    }
	}
}
