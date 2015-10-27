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
	      String sql ="";
	      String type ="";
	      stmt = Frames.con.createStatement();
	      for(int i = 0; i < 5; i++)
	      {
	    	  switch(i)
	    	  {
	    	  	case 0:
	    	  	{
	    	  		type = "PATIENT";
	   
	    	  		break;
	    	  	}
	    	  	case 1:
	    	  	{
	    	  		type = "DOCTOR";
	    	  		break;
	    	  	}
	    	  	case 2:
	    	  	{
	    	  		type = "NURSE";
	    	  		break;
	    	  	}
	    	  	case 3:
	    	  	{
	    	  		type = "LAB";
	    	  		break;
	    	  	}
	    	  	case 4:
	    	  	{
	    	  		type = "NSP";
	    	  		break;
	    	  	}
	    	  }
	    	  if(type != "")
	    	  {
		       		sql = "CREATE TABLE IF NOT EXISTS "+ "'"+type+"'"+"("
		      		+ "USERNAME TEXT, "
		      		+ "FIRSTNAME TEXT, "
		      		+ "LASTNAME TEXT, "
		      		+ "PASSWORD TEXT, "
		      		+ "EMAIL TEXT, "
		      		+ "GENDER TEXT, "
		      		+ "SSN TEXT, "
		      		+ "INSURANCENAME TEXT, "
		      		+ "PRIMARY KEY(USERNAME, LASTNAME, SSN));";
		       		
		       		
		            stmt.executeUpdate(sql);
	    	  }
	      }
	      
	    		  
	
	      stmt.close();
	    }
	    catch ( Exception e ) 
	    {
	        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	        System.exit(0);
	    }
	}
}
