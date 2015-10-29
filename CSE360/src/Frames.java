import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

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
			Statement stmt = con.createStatement();
			String query = "SELECT " + "'" + attr + "'" +
						" FROM " + "'"+ table + "'"
						+ " WHERE "  + attr  + " = " + "'" + find +"'"+";";
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				test = rs.getString("'"+attr+"'");
			}
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
		}
	}
	//public static void insert(String table, String username)
	public static void insert(String table, String username, String id)
	{
		try
		{
			String sql = "";
			Frames.con.setAutoCommit(false);
			Statement stmt = Frames.con.createStatement();
		
			
			sql = 	"INSERT INTO" + "'" + table + "'" + "(USERNAME, ID)" 
					+ "VALUES (" + "'"+ username + "'" + ",'" + id + "')";
			stmt.executeUpdate(sql);
			stmt.close();
			Frames.con.commit();
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
		}
	}
	public static void update(String table, String attr, String user, String value, String id)
	{
		try
		{
			String sql = "";
			String test = "";
			String num = "";
			int counter = 0;
			Frames.con.setAutoCommit(false);
			Statement stmt = Frames.con.createStatement();
		/*	sql = 	"UPDATE " + "'" + table + "'" + " set " + "'" + attr + "'"+
					" = " + "\""+ value + "\"" + " where USERNAME =" + " \""+ user +"\";";
					*/
			
			sql = 	"UPDATE " + "'" + table + "'" + " set " + "'" + attr + "'"+
					" = " + "\""+ value + "\"" + " where USERNAME =" + " \""+ user +"\""
							+ "AND ID = " + "'" + id + "';";
			
		/*	num = "SELECT USERNAME " +
					" FROM " + "'"+ table + "'"
					+ " WHERE USERNAME " + " = " + "\"" + user +"\""+";";
			
			ResultSet rs = stmt.executeQuery(num);
			while(rs.next())
			{
				test = rs.getString("USERNAME");
				counter++;
			}
			System.out.println(counter);*/
			
			stmt.executeUpdate(sql);
			stmt.close();
			Frames.con.commit();
		}
		catch(Exception e)
		{
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
		}
	}
	public static String rand()
	{
		Random rn = new Random();
		String randreturn;
		char c = (char)(rn.nextInt(26)+'a');

		int num = rn.nextInt(10);
		
		randreturn = new StringBuilder().append("").append(Character.toUpperCase(c)).append(num).toString();
		return randreturn;
	}
	public static ArrayList<String> list()
	{
		int counter = 0;
		ArrayList<String> retstr = new ArrayList<String>();
		try 
		{
			Frames.con.setAutoCommit(false);
			Statement stmt = Frames.con.createStatement();
			String list = "SELECT USERNAME FROM DOCTOR;";
			
			ResultSet rs = stmt.executeQuery(list);
			while(rs.next())
			{
				
				
					retstr.add(rs.getString("USERNAME"));
					System.out.println(retstr.get(counter));
					counter++;
				
			}
			
			stmt.executeUpdate(list);
			stmt.close();
			Frames.con.commit();
			return retstr;
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return retstr;
		}
		
	
	}
}
