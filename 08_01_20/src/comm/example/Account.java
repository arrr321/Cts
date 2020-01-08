package comm.example;

import java.util.UUID;

public class Account {
	
	private String AccountNumber;
	private String AccountHoldername;
	private int AccountAmount;
	private Account account = null;
	private String accountHoldername;
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getAccountHoldername() {
		return AccountHoldername;
	}
	public void setAccountHoldername(String accountHoldername) {
		AccountHoldername = accountHoldername;
	}
	public int getAccountAmount() {
		return AccountAmount;
	}
	public void setAccountAmount(int accountAmount) {
		AccountAmount = accountAmount;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Account(String accountNumber, String accountHoldername, int accountAmount) throws AccountnotcreatedException {
		super();
		AccountNumber = accountNumber;
		AccountHoldername = accountHoldername;
		AccountAmount = accountAmount;
		
	}
	
	
	public Account CreateAccount(String accountHoldername,int accountAmount) throws AccountnotcreatedException
	{
		account = new Account (UUID.randomUUID().toString(), accountHoldername , accountAmount) ;
		
		if(account.getAccountAmount()<5000)

		{throw new AccountnotcreatedException("The Account can't be created amount is less than 5000");
		
			
		}
		
		return account;
		
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [AccountNumber=" + AccountNumber + ", AccountHoldername=" + AccountHoldername
				+ ", AccountAmount=" + AccountAmount + ", account=" + account + ", accountHoldername="
				+ accountHoldername + "]";
	}
	

}
