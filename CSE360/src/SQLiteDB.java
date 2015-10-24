/** An implementation of the Database class, 
 * SQLiteDB contains all the methods necessary to push and pull
 *  data from the locally stored database.
 * @author Alec Oldenburg
 * 
 */
public class SQLiteDB implements Database {

	/** Adds an account to the 
	 * 
	 * 
	 * 
	 */
	public void createAccount(Account a) {
		

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
