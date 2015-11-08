
public class TestStub {
	public static void main(String[] args)
	{
		Account a = new Account("aoldenbu","password");
		SQLiteDB.createAccount(a);
		System.out.println(a.getBirthString());
		a = SQLiteDB.accessAccount("aoldenbu", "password");
		a.getBirthDate();
	}
}
