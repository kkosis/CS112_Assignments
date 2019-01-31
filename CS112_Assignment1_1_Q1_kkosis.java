import java.util.Scanner;

public class CS112_Assignment1_1_Q1_kkosis
{
	public static void main(String[] args)
	{
	  // Question 1
	  int a,b;
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a number:");
	  a = input.nextInt();
	  System.out.println("Enter another number:");
	  b = input.nextInt();
	  System.out.println("Sum = " + (a+b));
	  System.out.println("Difference = " + (a-b));
	  System.out.println("Product = " + (a*b));
	  System.out.println("Quotient = " + (a/b));
	  System.out.println("Remainder = " + (a%b));
	}
}