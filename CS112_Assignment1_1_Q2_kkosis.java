import java.util.Scanner;

public class CS112_Assignment1_1_Q2_kkosis
{
	public static void main(String[] args)
	{
	  // Question 2
	  double r;
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter a radius:");
	  r = input.nextDouble();
	  System.out.println("Area of Circle = " + (Math.PI * Math.pow(r,2)));
	  System.out.println("Circumference of Circle = " + (2 * Math.PI * r));
	}
}