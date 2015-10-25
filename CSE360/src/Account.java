import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Account {
	
	//Account Login information
	private String userName;
	private String password;
	
	private String firstName;
	private String lastName;
	
	//Personal Information
	private String email;
	private String cellNumber;
	private String workNumber;
	private Date birthDate;
	private Gender gender;
	private String maritalStatus;
	private String streetAddress;
	private String city;
	private String state;
	private int ssn;
	private boolean allowSms;
	
	//Emergency Contact Variables
	private String emergencyContactName;
	private String emergencyContactRelationship;
	private int emergencyContactPhone;
	
	//Primary Insurance Info
	private String primaryInsuranceName;
	private String primaryInsuranceAddress;
	private String policyNumber;
	private String groupNumber;
	private Date effectiveDate;
	private String policyHolder;
	
	private AccountType accountType;
	
	public Account(String u, String p)
	{
		userName = u;
		password = p;
	}
	public Account()
	{
		
	}
	public void setUserName(String s)
	{
		userName = s;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setPassword(String s)
	{
		password = s;
	}
	public String getPassword()
	{
		return password;
	}
	public void setFirstName(String s)
	{
		firstName = s;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setLastName(String s)
	{
		lastName = s;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setEmail(String s)
	{
		email = s;
	}
	public String getEmail()
	{
		return email;
	}
	public void setCellNumber(String i)
	{
		cellNumber = i;
	}
	public String getCellNumber()
	{
		return cellNumber;
	}
	public void setWorkNumber(String i)
	{
		workNumber = i;
	}
	public String getWorkNumber()
	{
		return workNumber;
	}
	public void setBirthDate(Date d)
	{
		birthDate = d;
	}
	public void setBirthDate(String s)
	{
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		
		try {
			birthDate = format.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Date getBirthDate()
	{
		return birthDate;
	}
	public String getBirthString()
	{
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		
		return format.format(birthDate);
		
	}
	public void setGender(Gender g)
	{
		gender = g;
	}
	public Gender getGender()
	{
		return gender;
	}
	public void setMaritalStatus(String s)
	{
		maritalStatus =s;
	}
	public String getMaritalStatus()
	{
		return maritalStatus;
	}
	public void setStreetAddress(String s)
	{
		streetAddress = s;
	}
	public String getStreetAddress()
	{
		return streetAddress;
	}
	public void setCity(String s)
	{
		city = s;
	}
	public String getCity(String s)
	{
		return city;
	}
	public void setState(String s)
	{
		state = s;
	}
	public String getState()
	{
		return state;
	}
	public void setSSN(int i)
	{
		ssn = i;
	}
	public int getSSN()
	{
		return ssn;
	}
	public void setAllowSms(boolean b)
	{
		allowSms = b;
	}
	public boolean getAllowSms()
	{
		return allowSms;
	}
	public void setEmergencyContactName(String s)
	{
		emergencyContactName = s;
	}
	public String getEmergencyContactName()
	{
		return emergencyContactName;
	}
	public void setEmergencyContactRelationship(String s)
	{
		emergencyContactRelationship = s;
	}
	public String getEmergencyContactRelationship()
	{
		return emergencyContactRelationship;
	}
	public void setEmergencyContactPhone(int i)
	{
		emergencyContactPhone = i;
	}
	public int getEmergencyContactPhone()
	{
		return emergencyContactPhone;
	}
	public void setInsuranceName(String s)
	{
		primaryInsuranceName = s;
	}
	public String getInsuranceName()
	{
		return primaryInsuranceName;
	}
	public void setInsuranceAddress(String s)
	{
		primaryInsuranceAddress = s;
	}
	public String getInsuranceAddress()
	{
		return primaryInsuranceAddress;
	}
	public void setPolicyNumber(String s)
	{
		policyNumber = s;
	}
	public String getPolicyNumber()
	{
		return policyNumber;
	}
	public void setGroupNumber(String s)
	{
		groupNumber = s;
	}
	public String getGroupNumber()
	{
		return groupNumber;
	}
	public void setEffectiveDate(Date d)
	{
		effectiveDate = d;
	}
	public void setEffectiveDate(String s)
	{
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		
		try {
			effectiveDate = format.parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Date getEffectiveDate()
	{
		return effectiveDate;
	}
	public String getEffectiveString()
	{
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		
		return format.format(birthDate);
	}
	public void setPolicyHolder(String s)
	{
		policyHolder = s;
	}
	public String getPolicyHolder()
	{
		return policyHolder;
	}
	public void setAccountType(AccountType a)
	{
		accountType = a;
	}
	public AccountType getAccountType()
	{
		return accountType;
	}
}


