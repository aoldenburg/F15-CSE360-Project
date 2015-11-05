
public class Prescription {
	int amount;
	String medication;
	String patient;
	
	public Prescription(String patient, String medication, int amount)
	{
		this.amount = amount;
		this.patient = patient;
		this.medication = medication;
	}
	
	public int getAmount()
	{
		return amount;
	}
	
	public String getMedication()
	{
		return medication;
	}
	public String getPatient()
	{
		return patient;
	}
}
