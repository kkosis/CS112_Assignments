import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class loopTest
{
	public static void main(String[] args)
	{
	  Scanner input = new Scanner(System.in);

	  System.out.println("How many items to be recorded?");
	  int numItems = input.nextInt();

	  String[] item = new String[numItems];
	  int[] quantity = new int[numItems];
	  double[] price = new double[numItems];
	  double[] total = new double[numItems];
	  String[] bill = new String[numItems+1];

	  int i = 1;

	  while(i <= numItems)
	  {
	  	System.out.println("----------------\nEnter the information for item " + i);
	  	System.out.print("Input name of item " + i + ": ");
	  	String itemblank = input.nextLine();
	  	item[i-1] = input.nextLine();
	  	System.out.print("Input quantity of item " + i + ": ");
	  	quantity[i-1] = input.nextInt();
	  	System.out.print("Input price of item " + i + ": $");
	  	price[i-1] = input.nextDouble();
	  	total[i-1] = quantity[i-1]*price[i-1];

	  	bill[i] = ((String.format("%-30s", (item[i-1].substring(0,1).toUpperCase() + item[i-1].substring(1)))) + 
	  		(String.format("%-10d", quantity[i-1])) +
	  		(String.format("$%-9.2f", price[i-1])) +
	  		(String.format("$%-9.2f", total[i-1])));

	  	i = i+1;
	  }

	  // Create bill
	  String itemTitle = "Title";
	  String quantityTitle = "Quantity";
	  String priceTitle = "Price";
	  String totalTitle = "Total";
	  bill[0] = (String.format("%-30s", itemTitle) +
	  	String.format("%-10s", quantityTitle) +
	  	String.format("%-10s", priceTitle) +
	  	String.format("%-10s", totalTitle));

	  System.out.println("----------------\nYour Bill:\n");
	  for(int x = 0; x <= numItems; x++)
	  {
	  	System.out.println(bill[x]);
	  }

	  double subtotal = DoubleStream.of(total).sum();
	  String subtitle = "Subtotal";
	  System.out.printf("%58s", "--------\n");
	  System.out.printf("%-50s", subtitle);
	  System.out.printf("$%-10.2f", subtotal);
	  System.out.println();

	  String salestax = "6.25% Sales Tax";
	  double taxtotal = subtotal*0.0625;
	  System.out.printf("%-50s", salestax);
	  System.out.printf("$%-10.2f", taxtotal);
	  System.out.println();

	  String totaltitle = "Total";
	  double totalamt = subtotal + taxtotal;
	  System.out.printf("%58s", "--------\n");
	  System.out.printf("%-50s", totaltitle);
	  System.out.printf("$%-10.2f", totalamt);
	  System.out.println();

	}
}