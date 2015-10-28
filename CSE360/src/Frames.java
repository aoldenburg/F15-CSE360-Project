import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frames
{
	public static LogInWindow login = new LogInWindow();
	public static UserAccountRegistration userReg = new UserAccountRegistration();
	public static MainWindow mainMenu = new MainWindow();
	public static UserMenuWindow userMenu = new UserMenuWindow();
	public static DoctorMenuWindow docMenu = new DoctorMenuWindow();
	public static LabStaffMenuWindow labMenu = new LabStaffMenuWindow();
	public static NurseMenuWindow nurseMenu = new NurseMenuWindow();
	public static NSPStaffMenuWindow nspMenu = new NSPStaffMenuWindow();
	
	public static ScheduleAppointment appt = new ScheduleAppointment();
	public static AppointmentList list = new AppointmentList();
	public static UpdateHealth cond = new UpdateHealth();
	public static UpdateAppointment update = new UpdateAppointment();
	public static CancelAppointment cancel = new CancelAppointment();
	public static EPrescribeWindow prescribe = new EPrescribeWindow();
	
	public static String user = "";

	//======================================
	//Frames.java -> sqliteConnection.java
	//=======================================
	public static Connection con = sqliteConnection.dbConnector();
	
	public static void find(String find, String attr, String table)
	{
		try
		{
			String test  = "";
			con.setAutoCommit(false);
		//	String acctype = "";
			Statement stmt = con.createStatement();
			String sql = "";
			
			
			/* for(int i = 0; i < 5; i++)
		     {
		    	  switch(i)
		    	  {
		    	  	case 0:
		    	  	{
		    	  		acctype = "PATIENT";
		   
		    	  		break;
		    	  	}
		    	  	case 1:
		    	  	{
		    	  		acctype = "DOCTOR";
		    	  		break;
		    	  	}
		    	  	case 2:
		    	  	{
		    	  		acctype = "NURSE";
		    	  		break;
		    	  	}
		    	  	case 3:
		    	  	{
		    	  		acctype = "LAB";
		    	  		break;
		    	  	}
		    	  	case 4:
		    	  	{
		    	  		acctype = "NSP";
		    	  		break;
		    	  	}
		    	  }*/
			
			
			/*	String query = "SELECT " + "'" + attr + "'" +
						" FROM " + "'"+ table + "'"
						+ " WHERE " + "'" +  = " + "\"" + find +"\""+";";
				
				
				ResultSet rs = stmt.executeQuery(query);
				
				while(rs.next())
				{
					test = rs.getString("USERNAME");
				}
			
		*/
				
		    // }
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
		}
	}
}
