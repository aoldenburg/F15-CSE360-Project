import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JFrame;

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
		System.out.println("h");
	}
}
