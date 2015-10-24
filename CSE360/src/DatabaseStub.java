import java.util.ArrayList;

public class DatabaseStub implements Database {
	
	ArrayList<Account> accounts = new ArrayList<Account>();
	
	public DatabaseStub()
	{
		Account a = new Account("admin", "admin");
		a.setAccountType(AccountType.Admin);
		
		accounts.add(a);
		
		a = new Account("Doctor", "Doctor");
		a.setAccountType(AccountType.Doctor);
		
		a.setFirstName("John");
		a.setLastName("Doe");
		
		accounts.add(a);
		
		a = new Account("user123", "MyPassword");
		a.setAccountType(AccountType.Doctor);
		
		a.setFirstName("Jake");
		a.setLastName("Smith");
		
		accounts.add(a);
	
	}

	@Override
	public void createAccount(Account a) {
		
		accounts.add(a);
	}

	@Override
	public Account accessAccount(String username, String password) {
		
		for(int i = 0; i < accounts.size(); i++)
		{
			if(accounts.get(i).getUserName().equals(username))
			{
				if(accounts.get(i).getPassword().equals(password))
				{
					return accounts.get(i);
				}
			}
		}
		
		return null;
	}

	@Override
	public void updateAccount(Account a) {
		
		for(int i = 0; i < accounts.size(); i++)
		{
			if(accounts.get(i).getUserName().equals(a.getUserName()))
			{
				accounts.set(i, a);
			}
		}
		
	}

	@Override
	public Account[] getDoctors(String name) {
		ArrayList<Account> doctors = new ArrayList<Account>();
		for(int i = 0; i < doctors.size(); i++)
		{
			if(accounts.get(i).getAccountType().equals(AccountType.Doctor))
			{
				doctors.add(accounts.get(i));
			}
		}
		return (Account[]) doctors.toArray();
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

	@Override
	public Account[] getDoctors(int zipcode, String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
