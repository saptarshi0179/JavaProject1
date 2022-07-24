import java.util.Scanner;
public class q01ArithmeticCalculator
{
	public static void main(String []args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A number");
		int num1=s.nextInt();
		System.out.println("Enter a second number");
		int num2=s.nextInt();
		
		System.out.println("Enter any arithmetic operater(+,-,*,%)");
		char ch=s.next().charAt(0);
		
		switch(ch)
		{
		case '+':
			System.out.println("Addition of "+num1+ " + " +num2+ " = "+(num1+num2));
			break;
			
		case '-':
			System.out.println("Subraction of "+num1+ " - " +num2+ " = "+(num1-num2));
			break;
			
		case '*':
			System.out.println("Multiplication of "+num1+ " * " +num2+ " = "+(num1*num2));
			break;
			
		case '/':
			System.out.println("Division of "+num1+ " / " +num2+ " = "+(num1/num2));
			break;
			
		case '%':
			System.out.println("Modulus of "+num1+ " % " +num2+ " = "+(num1%num2));
			break;	
			
		}
		
	}

}