public interface Database {
	/**
	 * Create Account
	 * @param account
	 * Accepts item of type account, creates a new row in the database for this account type.
	 */
	public void createAccount(Account account);
	/**
	 * Access Account
	 * @param username
	 * @param password
	 * @return account
	 * If account with specified UserName and password exists it returns that account.
	 * If it does not exist it returns Null.
	 */
	public Account accessAccount(String username, String password);

	/**
	 * Update Account
	 * @param account
	 * Accepts an object of type account and updates the database info for that account
	 */
	public void updateAccount(Account account);
	/**
	 * Get Doctors (By Name)
	 * @param name
	 * @return Account[] doctors
	 * Searches Doctors by name and returns an array of accounts matching those doctors
	 */
	public Account[] getDoctors(String name);
	/**
	 * Get Doctors (By Zip + Catagory)
	 * @param zipcode
	 * @param category
	 * @return Account[] doctors
	 * Searches doctors matching a specific zipcode or category and returns an array of matching doctors
	 */
	public Account[] getDoctors(int zipcode, String category);
	/**
	 * Get Patients
	 * @param firstName
	 * @param LastName
	 * @return Account
	 * Searches patients by first and last name, returns an array of accounts with matching information
	 */
	public Account[] getPatients(String firstName, String LastName);
	/**
	 * Add File
	 * @param filePath
	 * 
	 */
	public void addFile(String filePath);
	/**
	 * Remove File
	 * @param filePath
	 */
	public void removeFile(String filePath);
	/**
	 * Add Appointment
	 * @param a
	 */
	public void addAppointment(Appointment a);
	/**
	 * Remove Appointment
	 * @param a
	 */
	public void removeAppointment(Appointment a);
	/**
	 * Get Appointment
	 * @param appointmentId
	 * @return Appointment
	 */
	public Appointment getAppointment(int appointmentId);
	/**
	 * Get File
	 * @param fileId
	 * @return
	 */
	public String getFile(int fileId);

}
