import java.util.Scanner;

public class CS112_Assignment1_2_QC_kkosis
{
	public static void main(String[] args)
	{
	  String money; 
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter Amount in Dollars: $");
	  money = input.nextLine();
	  System.out.println();

	  int i = money.indexOf("."); 
	  int dollars = Integer.parseInt(money.substring(0,i));
	  int numTens = dollars/10;
	  System.out.println("$10: " + numTens);
	  int numFives = (dollars - 10*numTens)/5;
	  System.out.println("$5: " + numFives);
	  int numOnes = (dollars - (10*numTens + 5*numFives))/1;
	  System.out.println("$1: " + numOnes);

	  int cents = Integer.parseInt(money.substring(i+1));
	  int num50c = cents/50;
	  System.out.println("50 Cents: " + num50c);
	  int numQuarters = (cents - 50*num50c)/25;
	  System.out.println("Quarters: " + numQuarters);
	  int numDimes = (cents - (50*num50c + 25*numQuarters))/10;
	  System.out.println("Dimes: " + numDimes);
	  int numPennies = (cents - (50*num50c + 25*numQuarters + 10*numDimes))/1;
	  System.out.println("Pennies: " + numPennies);
	}
	
}