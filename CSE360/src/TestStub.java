import java.util.ArrayList;
import java.util.Iterator;

public class TestStub {
	public static void main(String[] args)
	{
		Account a = new Account("burger","password");
		SQLiteDB.createAccount(a);
		
	}
}
