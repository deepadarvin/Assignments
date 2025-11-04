package language.basics;

public class workers {

		// TODO Auto-generated method stub
String emp1= "Bharath";
String emp2= "abc";
String emp3= "xyz";

int id1=1234;
int id2=1235;
int id3=1236;

	}


public class Employee { 
	
	public static void main (String[] args) {
		
		workers e = new workers();
	
	String[] empname = { e.emp1, e.emp2, e.emp3 };
	int[] empid = { e.id1, e.id2, e.id3 };
	
	
	
for(int i=0; i<empname.length; i++)
{	
	System.out.println("Employee Name:"+empname[i]+ "Employee id:"+ empid[i]);
}


}
}