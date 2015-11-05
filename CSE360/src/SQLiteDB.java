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
	 *  Does not check to see if the account already exists in current implementation.
	 *  @param a The account to be added.
	 */
	public void createAccount(Account a) {
		
		try {
			
			if(a == null) throw new IllegalArgumentException("Account passed was null");
			File file = new File("data/EmployeeData.sqlite");
			Class.forName("org.sqlite.JDBC");
			Connection connector=DriverManager.getConnection("jdbc:sqlite:" + file.getAbsolutePath());
			String query = "INSERT INTO UserTable (username,password,type,firstname,lastname,workPhone,cellPhone,email,doctorType,bday,gender,maritalStatus,address,city,state,ssn,allowSMS,ecName,ecRelationship,ecPhone,piname,piaddress,policynum,groupnum,effectivedate,policyholder) VALUES "
					+ "(\'" + a.getUserName() + "\', "
					+ "\'" + a.getPassword() + "\', \'"
					+ a.getAccountType().toString() + "\', \'"
					+ a.getFirstName() + "\', \'"
					+ a.getLastName() + "\',"
					+ a.getWorkNumber() + ","
					+ a.getCellNumber() + ", \'"
					+ a.getEmail() + "\', \'"
					+ a.getDoctorType().toString() + "\', \'"
					+ a.getBirthDate() + "\', \'"
					+ a.getGender() + "\', \'"
					+ a.getMaritalStatus() + "\', \'"
					+ a.getStreetAddress() + "\', \'"
					+ a.getCity() + "\', \'"
					+ a.getState() + "\',"
					+ a.getSSN() + ", \'"
					+ (a.getAllowSms() ? "1" : "0") + "\', \'"
					+ a.getEmergencyContactName() + "\', \'"
					+ a.getEmergencyContactRelationship() + "\',"	
					+ a.getEmergencyContactPhone() + ", \'"
					+ a.getInsuranceName() + "\', \'"
					+ a.getInsuranceAddress() + "\', \'"
					+ a.getPolicyNumber() + "\', \'"
					+ a.getGroupNumber() + "\', \'"
					+ a.getEffectiveDate() + "\', \'"
					+ a.getPolicyHolder() + "\')";
			Statement st = connector.createStatement();
			st.executeUpdate(query);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/** Queries the database for a given username and password.
	 *  If found, parses the values of the associated account.
	 * @param username The username of the account to be queried.
	 * @param password The password of the account to be queried.
	 * @throws IllegalArgumentException Either username or password was empty.
	 * @return if the associated username + password combo is correct, the Account associated with it. Otherwise returns NULL Account.
	 */
	public Account accessAccount(String username, String password) throws IllegalArgumentException{
		try {
			if(username.equals("") || password.equals("")) 
			{
				throw new IllegalArgumentException("");
			}
			File file = new File("data/EmployeeData.sqlite");
			file.getAbsolutePath();
			Class.forName("org.sqlite.JDBC");
			Connection connector = DriverManager.getConnection("jdbc:sqlite:" + file.getAbsolutePath());
			PreparedStatement statement = connector.prepareStatement("SELECT * FROM UserTable WHERE username=? AND password=?");
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet results = statement.executeQuery();
			Account foundAcc = new Account(results.getString(1),results.getString(2));
			return foundAcc;
			
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateAccount(Account a) {
		// TODO Auto-generated method stub
		//try {
			
	//	}
	}
	public Account getAccount(int ID)
	{
		return null;
		//TODO
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
	public void updateAppointment(Appointment a)
	{
		// TODO
	}
	public void addPrescription(Account patient, String medicine, int amount)
	{
		try {
			if(patient == null)
			{
				throw new IllegalArgumentException("Account passed was null");
			}
		
			File file = new File("data/EmployeeData.sqlite");
			Class.forName("org.sqlite.JDBC");
			Connection connector=DriverManager.getConnection("jdbc:sqlite:" + file.getAbsolutePath());
			String query = "INSERT INTO Perscriptions (patient, medicine, amount) VALUES "
				+ "(\'" + patient.getUserName() + "\', "
				+ "\'" + medicine + "\', "
				+ "\'" + amount + "\');";
			Statement st = connector.createStatement();
			st.executeUpdate(query);
		} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Prescription[] getPrescriptions(Account a)
	{
		try {
			File file = new File("data/EmployeeData.sqlite");
			file.getAbsolutePath();
			Class.forName("org.sqlite.JDBC");
			Connection connector = DriverManager.getConnection("jdbc:sqlite:" + file.getAbsolutePath());
			PreparedStatement statement = connector.prepareStatement("SELECT * FROM Prescriptions WHERE patient=?");
			statement.setString(1, a.getUserName());
			ResultSet results = statement.executeQuery();
			int rowCount = results.getInt("rowcount");
			Prescription[] prescription = new Prescription[rowCount];
			for(int i = 0; i < rowCount; i++)
			{
				prescription[i] = new Prescription(results.getString(1),results.getString(2), results.getInt(3));
				results.next();
			}
			
			
			return prescription;
			
		}
		catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	}
	public Condition[] getPatientConditions(Account a)
	{
		
	}
}
