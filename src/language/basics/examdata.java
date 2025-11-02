package language.basics;

public class examdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Declare 3d array
		String[][][] info = {
				{
				//Semester 1
				{"Mathematics I","Pass(78)"},
				{"physics","Pass(89)"},
				{"chemistry","Pass(77)"}
		},
		    { //semester 2
			{"Mathematics","pass(88)"},
			{"Physics","pass(76)"},
			{"chemistry","pass(85)"}
			}
			
				};
		
		
		
	
		
		



//loop through all semesters and subjects
 for (int i=0;i<info.length;i++)
{
	    System.out.println("\n📘 Semester " + (i + 1) + " Details:");
	    System.out.println("---------------------------------------------");
	    System.out.printf("%-4s %-30s %s%n", "No.", "Subject", "Status/Marks");
	    System.out.println("---------------------------------------------");
	    
	    // loop through subjects
	    for (int j = 0; j < info[i].length; j++) {
	        System.out.printf("%-4d %-30s %s%n", (j + 1), info[i][j][0], info[i][j][1]);
	   
	    }
	}
}
}