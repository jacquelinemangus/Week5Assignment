
//9.	Create a class named App that has a main method.
//10.	In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//      public class App {
//11.	Test both methods on both instances, passing in Strings of your choice.
//10.	In this class instantiate an instance of each of your logger classes that implement the Logger interface.
//      public class App {
//11.	Test both methods on both instances, passing in Strings of your choice.


package part1;

public class App {
	public static void main(String [] args) {
		System.out.println("");
		System.out.println("");
	


 Logger num1 = new AsteriskLogger();
num1.Error("Warning"+ "");
num1.Log("The Color is Blue");

 Logger num2= new SpacedLogger();
 num2.Error("Java Madness");
 num2.Log("Summer March");
}
}