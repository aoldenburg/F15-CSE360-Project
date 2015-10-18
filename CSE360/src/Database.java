public interface Database {
	
	public void createAccount(Account a);
	public Account accessAccount(String username, String password);
	public void updateAccount(Account a);
	public Account[] getDoctors(String name);
	public Account[] getDoctors(int zipcode, String category, String insuranceType); //Category is the type of the doctor, Insurance type is different, find out why its there and remove if unneeded
	public Account[] getPatients(String firstName, String LastName);
	public void addFile(String filePath);
	public void removeFile(String filePath);
	public void addAppointment(Appointment a);
	public void removeAppointment(Appointment a);
	public Appointment getAppointment(int appointmentId);
	public String getFile(int fileId);

}
