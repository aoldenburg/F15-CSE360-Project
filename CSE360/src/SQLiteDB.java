import java.io.File;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/** An implementation of the Database class, 
 * SQLiteDB contains all the methods necessary to push and pull
 *  data from the locally stored database.
 * @author Alec Oldenburg
 * @version 1.0
 */
public class SQLiteDB {
	
	/** Adds an account to the user login database
	 *  as well as their appropriate table (patient, doctor, staff, etc.).
	 *  Does not check to see if the account already exists in current implementation.
	 *  @param a The account to be added.
	 */
	public static void createAccount(Account a) {
		
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
					+ a.getBirthString() + "\', \'"
					+ a.getGender() + "\', \'"
					+ a.getMaritalStatus() + "\', \'"
					+ a.getStreetAddress() + "\', \'"
					+ a.getCity("") + "\', \'"
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
					+ a.getEffectiveString() + "\', \'"
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
	public static Account accessAccount(String username, String password) throws IllegalArgumentException{
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
			String foundUser = results.getString(2);
			String foundPass = results.getString(3);
			AccountType foundAccType = AccountType.valueOf(results.getString(4));
			String foundFirst = results.getString(5);
			String foundLast = results.getString(6);
			String foundWork = results.getString(7);
			String foundPhone = results.getString(8);
			String email = results.getString(9);
			DoctorType foundDocType = DoctorType.valueOf(results.getString(10));
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			Date foundBday = new Date();
			Date foundEffDate = new Date();
			try {
				foundBday = dateFormat.parse(results.getString(11));
				foundEffDate = dateFormat.parse(results.getString(26));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Gender foundGender = Gender.valueOf(results.getString(12));
			String foundMarried = results.getString(13);
			String foundAdd = results.getString(14);
			String foundCity = results.getString(15);
			String foundState = results.getString(16);
			String ssn = results.getString(17);
			boolean allowSMS = (results.getInt(18) == 1) ? true : false;
			String foundEcName = results.getString(19);
			String foundEcRelationship = results.getString(20);
			String foundEcPhone = results.getString(21);
			String piname = results.getString(22);
			String piaddress = results.getString(23);
			String policyNum = results.getString(24);
			String groupNum = results.getString(25);
			String policyHolder = results.getString(27);
			
			
			
			Account foundAcc = new Account(foundUser,foundPass);
			foundAcc.setAccountType(foundAccType);
			foundAcc.setFirstName(foundFirst);
			foundAcc.setLastName(foundLast);
			foundAcc.setWorkNumber(foundWork);
			foundAcc.setCellNumber(foundPhone);
			foundAcc.setBirthDate(foundBday);
			foundAcc.setEffectiveDate(foundEffDate);
			foundAcc.setGender(foundGender);
			foundAcc.setMaritalStatus(foundMarried);
			foundAcc.setStreetAddress(foundAdd);
			foundAcc.setState(foundState);
			foundAcc.setSSN(ssn);
			foundAcc.setAllowSms(allowSMS);
			foundAcc.setEmergencyContactName(foundEcName);
			foundAcc.setEmergencyContactRelationship(foundEcRelationship);
			foundAcc.setEmergencyContactPhone(foundEcPhone);
			foundAcc.setInsuranceName(piname);
			foundAcc.setInsuranceAddress(piaddress);
			foundAcc.setPolicyNumber(policyNum);
			foundAcc.setGroupNumber(groupNum);
			foundAcc.setPolicyHolder(policyHolder);
			
			
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
	public Account[] getDoctors(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Account[] getDoctors(int zipcode, String category, String insuranceType) {
		// TODO Auto-generated method stub
		return null;
	}

	public Account[] getPatients(String firstName, String LastName) {
		// TODO Auto-generated method stub
		return null;
	}
	public void addAppointment(Appointment a) {
		// TODO Auto-generated method stub

	}
	public void removeAppointment(Appointment a) {
		// TODO Auto-generated method stub

	}
	public Appointment getAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}
	public void updateAppointment(Appointment a)
	{
		// TODO
	}
	public void addPrescription(Account a)
	{
		//TODO
	}
	public Prescription[] getPrescriptions(Account a)
	{
		//TODO
		return null;
	}
	public Condition[] getPatientConditions(Account a)
	{
		//TODO
		return null;
	}
}
