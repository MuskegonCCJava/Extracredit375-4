import java.text.DecimalFormat;
import java.util.Random;


public class Extra_Main
{

	public static void main(String[] args)
	{
		double[] prices = new double[20];
		double average = 0.0;
		double sum = 0.0;
		Random r = new Random();
		DecimalFormat format = new DecimalFormat("$##.00");
		
		System.out.print("Prices Inlude: ");
		
		for (int counter = 0; counter < 20; counter++)
		{
			prices[counter] = ((20 - 0) * r.nextDouble());	//	Calculates random double with a range.  (max-min)*random + min
			System.out.print(format.format(prices[counter]) + " ");
			sum += prices[counter];
		}
		
		average = sum / 20.0;
		
		System.out.println("\nSum of all prices: " + format.format(sum));
		System.out.println("Average of all prices: " + format.format(average));
		System.out.print("Prices higher than average: ");
		
		for (int counter = 0; counter < 20; counter++)
		{
			if (prices[counter] > average)
				System.out.print(format.format(prices[counter]) + " ");
		}
	}
}
