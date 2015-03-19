/*Extra_Main.java by Kyle Wolff and Brandon Vandermey March 2015*/
import java.text.DecimalFormat;
import java.util.Date;


public class Extra_Main
{
	
	static Float x = 0.0f;
	static Float y = 0.0f;
	static Float average = 0.0f;
	static String lessThan5 = null;
	

	static DecimalFormat df = new DecimalFormat("#,###.00");
		
	public static void main(String[] args)
	{
		Float[] price = Array();
		
		for(int i = 0; i < price.length ; i++)
		{
			 x = x + price[i];
				
		}
		
		Date today = new Date();
		System.out.print("Extra_Main by Kyle Wolff and Brandon Vandermey " + today + "\n\n");
		
		System.out.println("The sum of the Array is " + x);
		System.out.print("Prices less than 5 are [");
		
		for(int i = 0; i < price.length; i++)
		{
			if(price[i] < 5.00f)
			{
				
				System.out.print(price[i] + " -- ");
			}
			
			average = x / price.length;
		}
		
		System.out.print("]");
		System.out.println("\n" + df.format(average));
		System.out.print("Prices greater than the average -- ");
		
		for(int i = 0; i < price.length; i++)
		{
			if(price[i] > average)
			{
				System.out.print(price[i] + " -- ");
			}
		}
		
		
		
		
		
	}
	
	public static Float[] Array(){
		
		Float[] prices = {2.89f, 2.32f, 4.56f, 10.67f, 3.45f, 2.20f, 1.35f, 1.90f, 9.87f, 10.22f, 32.45f,
						  3.21f, 7.87f, 6.57f, 5.67f, .23f, 1.00f, 1.13f, 4.56f , 3.45f};
		
		return prices;
	}
	

}

