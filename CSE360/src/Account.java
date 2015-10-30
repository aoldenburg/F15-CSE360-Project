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
	private int cellNumber;
	private int workNumber;
	private String birthDate;
	private Gender gender;
	private String maritalStatus;
	private String streetAddress;
	private String city;
	private String state;
	private int ssn;
	private boolean allowSms;
	private DoctorType docType;
	
	//Emergency Contact Variables
	private String emergencyContactName;
	private String emergencyContactRelationship;
	private int emergencyContactPhone;
	
	//Primary Insurance Info
	private String primaryInsuranceName;
	private String primaryInsuranceAddress;
	private String policyNumber;
	private String groupNumber;
	private String effectiveDate;
	private String policyHolder;
	
	private AccountType accountType;
	
	public Account(String u, String p)
	{
		userName = u;
		password = p;
		firstName = "";
		lastName = "";
		email = "";
		cellNumber = 0;
		workNumber = 0;
		birthDate = "";
		gender = Gender.Male;
		maritalStatus = "";
		streetAddress = "";
		city = "";
		state = "";
		ssn = 0;
		allowSms = false;
		docType = DoctorType.NonDoctor;
		emergencyContactName = "";
		emergencyContactRelationship = "";
		emergencyContactPhone = 0;
		primaryInsuranceName = "";
		primaryInsuranceAddress = "";
		policyNumber = "";
		groupNumber = "";
		effectiveDate = "";
		policyHolder = "";
		accountType = AccountType.Patient;
		
		
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
	public void setCellNumber(int i)
	{
		cellNumber = i;
	}
	public int getCellNumber()
	{
		return cellNumber;
	}
	public void setWorkNumber(int i)
	{
		workNumber = i;
	}
	public int getWorkNumber()
	{
		return workNumber;
	}
	
	public void setBirthDate(String s)
	{
		birthDate = s;
	}
	public String getBirthDate()
	{
		return birthDate;
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
	public String getCity()
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
	public void setEffectiveDate(String s)
	{
		effectiveDate = s;
	}
	public String getEffectiveDate()
	{
		return effectiveDate;
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
	public DoctorType getDoctorType()
	{
		return docType;
	}
	public void setDoctorType(DoctorType doctorType)
	{
		this.docType = doctorType;
	}
}


