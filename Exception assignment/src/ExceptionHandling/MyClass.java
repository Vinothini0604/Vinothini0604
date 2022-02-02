package ExceptionHandling;

public class MyClass {
static void checkAge(int age){
	if (age<18){
		throw new ArithmeticException("Access denied-you must be atleast 18 years old.");
		
	}
	else{
		System.out.println("Access granted-you are eligible!");
		
	}
}
public static void main (String[]args){
	checkAge(17+1);
}
}
