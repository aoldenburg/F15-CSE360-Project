import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class DatabaseStub implements Database {
	
	ArrayList<Account> accounts = new ArrayList<Account>();
	
	public DatabaseStub()
	{
		
		
		Account a = new Account("admin", "admin");
		a.setAccountType(AccountType.Admin);
		a.setFirstName("Allen");
		a.setLastName("James");
		a.setAccountType(AccountType.Patient);
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
		
		saveFile();
		getFile();
	
	}

	@Override
	public void createAccount(Account a) {
		
		
		
		accounts.add(a);
		saveFile();
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
		
		saveFile();
		
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
	
	private void saveFile()
	{
		PrintWriter writer;
		try {
			writer = new PrintWriter("database.txt", "UTF-8");
			
			for(int i = 0; i < accounts.size(); i++)
			{
				Account a = accounts.get(i);
				String s = null;
				if(a.getAccountType() == AccountType.Doctor)
				{
					s = "2";
				}
				else if(a.getAccountType() == AccountType.Patient)
				{
					s = "1";
				}
				
				writer.println(a.getUserName() + "/" + a.getPassword() + "/" + a.getFirstName() + "/" + a.getLastName() + "/" + s);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void getFile()
	{
		try {
			Scanner in = new Scanner(new FileReader("database.txt"));
			
			while(in.hasNextLine())
			{
				String[] account = in.nextLine().split("/");
				
				Account a = new Account(account[0], account[1]);
				
				a.setFirstName(account[2]);
				a.setLastName(account[3]);
				if(account[4].equals("1"))
				{
					a.setAccountType(AccountType.Patient);
				}
				else if(account[4].equals("2"))
				{
					a.setAccountType(AccountType.Doctor);
				}
				
				accounts.add(a);
				
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

