import java.util.Scanner;

public class CS112_Assignment2_1_Q1_kkosis
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Pick any number:");
		double n = input.nextDouble();
		System.out.println("Make a guess at what that number's square root is:");
		double guess = input.nextDouble();
		// Babylonian 1
		double r = n/guess;
		double guess2 = (guess + r)/2;
		// Babylonian 2
		double r2 = n/guess2;
		double guess3 = (guess2 + r2)/2;
		// Babylonian 3
		double r3 = n/guess3;
		double guess4 = (guess3 + r3)/2;
		// Babylonian 4
		double r4 = n/guess4;
		double guess5 = (guess4 + r4)/2;
		// Babylonian 5
		double r5 = n/guess5;
		System.out.println("Babylonian square root = " + r5);
	}
}