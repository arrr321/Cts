package Pass;

public class Password {
	
	
	
 public static void main(String[] argv) throws PasswordChecker
 
 {
	
	
	 
}
private	String password;
	boolean result;
	char[] ch;
	public Password(String password) {
		super();
		this.password = password;
		ch = new char [password.length()]; 
	}
	
	public boolean CheckPassword(String password) throws PasswordChecker
	{
		if(password.length()>=8 && password.length()<=15)
		{
			for(int i = 0 ; i<password.length();i++)
			{
				ch[i] = password.charAt(i);
				
			}
		}
		
		else
		{
			throw new PasswordChecker ("password length is not matched");
			
		}
		
		
		return result;
		
	}
	
	
	
	
	
}
