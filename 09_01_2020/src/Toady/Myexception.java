package Toady;

public class Myexception extends Exception {
	
	private String mesg;
	
	public Myexception(String mesg) {
		
		super(mesg);
	}

	@Override
	public String toString() {
		return "Myexception [mesg=" + mesg + "]";
	}
	

	

}
