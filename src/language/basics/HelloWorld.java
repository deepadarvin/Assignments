package language.basics;



public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*This is the main method, the starting point of execution for any program 
		 * these comments are important <h1> First Program </h1>
		 */
		int x = 5;
		int y = 6;
		int	z= x + y;
		System.out.println("sum of numbers:" +z);
		
		
	}
	
	PrintWriter logs = new PrintWriter("C:\\AutomationTraining\\javaTraining\\Logs.txt");
	logs.println("Line 57 is executed");
	logs.close();


}
