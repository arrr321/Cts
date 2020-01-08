package Pass;

import java.util.Arrays;

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
				System.out.println(ch);
				if (!password.matches("[a-zA-Z0-9]+")) {
					
					throw new PasswordChecker("Password invalid");
				}
					
				
				
			}else {
				result = true;
			}
		}
		else 
		{
			throw new PasswordChecker ("password length is not matched");
			
		}
		if (result)
		{
			System.out.println("Succefullylogin");
		}
			
		
			
			
		
		return result;
	}

	@Override
	public String toString() {
		return "Password [password=" + password + ", result=" + result + ", ch=" + Arrays.toString(ch) + "]";
	}
		
	
	
	
	
	
}
