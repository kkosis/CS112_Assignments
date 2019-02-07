import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class CS112_Assignment2_1_Q2_kkosis
{
	public static void main(String[] args)
	{
	  Scanner input = new Scanner(System.in);
	  // Item 1
	  System.out.print("Input name of item 1: ");
	  String item1name = input.nextLine();
	  System.out.print("Input quantity of item 1: ");
	  int item1q = input.nextInt();
	  System.out.print("Input price of item 1: $");
	  double item1p = input.nextDouble();
	  double item1total = item1q*item1p;
	  // Item 2
	  System.out.print("Input name of item 2: ");
	  String item2blank = input.nextLine();
	  String item2name = input.nextLine();
	  System.out.print("Input quantity of item 2: ");
	  int item2q = input.nextInt();
	  System.out.print("Input price of item 2: $");
	  double item2p = input.nextDouble();
	  double item2total = item2q*item2p;
	  // Item 3
	  System.out.print("Input name of item 3: ");
	  String item3blank = input.nextLine();
	  String item3name = input.nextLine();
	  System.out.print("Input quantity of item 3: ");
	  int item3q = input.nextInt();
	  System.out.print("Input price of item 3: $");
	  double item3p = input.nextDouble();
	  double item3total = item3q*item3p;
	  System.out.println();
	  // Bill
	  System.out.println("Your Bill:");
	  String title1 = "Item";
	  String title2 = "Quantity";
	  String title3 = "Price";
	  String title4 = "Total";
	  System.out.printf("%-30s", title1);
	  System.out.printf("%-10s", title2);
	  System.out.printf("%-10s", title3);
	  System.out.printf("%-10s", title4);
	  System.out.println();
	  // Line 1
	  System.out.printf("%-30s", (item1name.substring(0,1).toUpperCase() + item1name.substring(1)));
	  System.out.printf("%-10d", item1q);
	  System.out.printf("$%-9.2f", item1p);
	  System.out.printf("$%-10.2f", item1total);
	  System.out.println();
	  // Line 2
	  System.out.printf("%-30s", (item2name.substring(0,1).toUpperCase() + item2name.substring(1)));
	  System.out.printf("%-10d", item2q);
	  System.out.printf("$%-9.2f", item2p);
	  System.out.printf("$%-10.2f", item2total);
	  System.out.println();
	  // Line 3
	  System.out.printf("%-30s", (item3name.subsrring(0,1).toUpperCase() + item3name.substring(1)));
	  System.out.printf("%-10d", item3q);
	  System.out.printf("$%-9.2f", item3p);
	  System.out.printf("$%-10.2f", item3total);
	  System.out.println();
	  // Subtotal
	  String subtitle = "Subtotal";
	  double subtotal = item1total + item2total + item3total;
	  System.out.printf("%-50s", subtitle);
	  System.out.printf("$%-10.2f", subtotal);
	  System.out.println();
	  // Sales tax
	  String salestaxtitle = "6.25% Sales Tax";
	  double salestax = subtotal*0.0625;
	  System.out.printf("%-50s", salestaxtitle);
	  System.out.printf("$%-10.2f", salestax);
	  System.out.println();
	  // Total
	  String totaltitle = "Total";
	  double totalamt = subtotal + salestax;
	  System.out.printf("%-50s", totaltitle);
	  System.out.printf("$%-10.2f", totalamt);
	  System.out.println();
	}
}