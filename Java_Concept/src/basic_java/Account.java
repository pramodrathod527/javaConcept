package basic_java;

public class Account {
													
	static String bankName;
	long accountNumber;
	String accountHolderName;
	double balance;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Account.bankName = "State Bank Of India";	
		
	Account acc1 = new Account();
	
	acc1.accountNumber = 62354100965l;
	acc1.accountHolderName = "Pramod Arjun Rathod";
	acc1.balance = 100000;
	
	Account acc2 = new Account();
	

	acc2.accountNumber = 62354100965l;
	acc2.accountHolderName = "Manoj Arjun Rathod";
	acc2.balance = 500000;
	
	
	System.out.println("Account1 Details");
	System.out.println(acc1.bankName);
	System.out.println(acc1.accountHolderName);
	System.out.println(acc1.accountNumber);
	System.out.println(acc1.balance);
	
	
	System.out.println("==============================");
	
	
	System.out.println(acc2.bankName);
	System.out.println(acc2.accountHolderName);
	System.out.println(acc2.accountNumber);
	System.out.println(acc2.balance);
	
	

	}

}
