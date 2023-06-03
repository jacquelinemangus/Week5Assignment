package part1;

public class AsteriskLogger implements Logger {

	public void Log(String log) {
		// TODO Auto-generated method stub
	
		
//System.out.println("***"+ "logger"+ "***" );
		System.out.print("****************" + "Error: "+ log + "***" + "****************"); 	
		}
	

public void Error(String num2) {
		// TODO Auto-generated method stub
		System.out.print("***" + num2 + "***");
           for (int i=0; i <num2.length(); i++); {
		System.out.println(num2); 
		}
}
}




	
		

	

	


////3.	Create two classes that implement the Logger interface
////a.	AsteriskLogger
////b.	SpacedLogger

////4.	The log method on the AsteriskLogger should print out the String it receives between 3 
////asterisks on either side of the String (e.g. if the String passed in is “Hello”, then it should print ***Hello*** to the console).

//5.	The error method on the AsteriskLogger should print the String it receives inside a box of asterisks,
////with the String preceded by the word “ERROR:”. For example, if “Hello” is the argument, the following should be printed:
//System.out.print("****************" + "***Error: Hello***" + "****************");
//System.out.println("H e l l o");
//System.out.println("ERROR: H e l l o");
//{
//}
//}