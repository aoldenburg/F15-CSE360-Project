import java.io.File;
import java.sql.*;



/** An implementation of the Database class, 
 * SQLiteDB contains all the methods necessary to push and pull
 *  data from the locally stored database.
 * @author Alec Oldenburg
 * @version 1.0
 */
public class SQLiteDB implements Database {
	
	/** Adds an account to the user login database
	 *  as well as their appropriate table (patient, doctor, staff, etc.).
	 * 
	 *  @param a The account to be added.
	 */
	public void createAccount(Account a) {
		
		try {
			if(a == null) throw new IllegalArgumentException("Account passed was null");
			File file = new File("data/EmployeeData.sqlite");
			file.getAbsolutePath();
			Class.forName("org.sqlite.JDBC");
			Connection connector=DriverManager.getConnection("jdbc:sqlite:" + file.getAbsolutePath());
			String query = "INSERT INTO UserTable (username, password, type) VALUES (\'" + a.getUserName() + "\', "
					+ "\'" + a.getPassword() + "\', \'" + a.getAccountType().toString() + "\')";
			Statement st = connector.createStatement();
			st.executeUpdate(query);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Account accessAccount(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateAccount(Account a) {
		// TODO Auto-generated method stub

	}

	@Override
	public Account[] getDoctors(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account[] getDoctors(int zipcode, String category, String insuranceType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account[] getPatients(String firstName, String LastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addFile(String filePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeFile(String filePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addAppointment(Appointment a) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeAppointment(Appointment a) {
		// TODO Auto-generated method stub

	}

	@Override
	public Appointment getAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFile(int fileId) {
		// TODO Auto-generated method stub
		return null;
	}

}
