
public class Perscription {
	private String medication;
	private int amount;
	private Account perscriber;
	private Account patient;
	
	public Perscription(String medication, int amount, Account perscriber, Account patient)
	{
		this.medication = medication;
		this.amount = amount;
		this.perscriber = perscriber;
		this.patient = patient;
	}
	
	public String getMed()
	{
		return medication;
	}
	
	public int getAmount()
	{
		return amount;
	}
	public Account getPerscriber()
	{
		return perscriber;
	}
	public Account getPatient()
	{
		return patient;
	}

}
