
public class DBStub {

	public static void main(String[] args) {
		SQLiteDB sequel = new SQLiteDB();
		Account acc = new Account("aoldenbu","password");
		sequel.createAccount(acc);
		System.out.println("Done!");
		
	}

}
