package comm.example;

public class RecruiterMain {
public static void main(String[] args) throws DetailException, DetailAmbiguityException
{
 Employee e = new Employee(10, "Arun", "say Address", 5);
 Employee e1 = new Employee(11, "Mannu", "hello Address",1);
 boolean result = e.equals(e1);
if(result)
{		 	 System.err.println("Duplicacy in data");	
			 throw new DetailAmbiguityException("Ambigous Details");
		 }
else {
   try {
	e.createEmployee();
	System.out.println(e);
	e1.createEmployee();
	System.out.println(e1);
} catch (HireExperienceException he) {
	// TODO Auto-generated catch block
	he.printStackTrace();
	System.err.println("Experience not sufficient");
}}
}
}