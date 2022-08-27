
public class CaseStudy1 
{

	public static void main(String[] args) 
	{
		String[] drinks = {"water", "coke", "lemonade", "orange"};
		double[] prices = {1.50, 2, 1.75, 2.5};
		CaseStudy1 menu = new CaseStudy1();
		menu.menu(drinks, prices);
		System.out.println();
		menu.order(drinks, prices);
	}

	void menu(String[] drinks, double[] prices) 
	{
		for (int i = 0; i < 4; i++) 
		{
			System.out.println("Menu item: " + drinks[i] + " - " + prices[i]);
		}
	}
	
	void order(String[] drinks, double[] prices) 
	{
		String[] choice = {"coke", "water"};
		double total = 0;
		for (int choiceIndex = 0; choiceIndex < 2; choiceIndex++) 
		{
			for (int drinksIndex = 0; drinksIndex < 4; drinksIndex++) 
			{
				if (choice[choiceIndex].equals(drinks[drinksIndex])) 
				{
					System.out.println("Your order is " + drinks[drinksIndex] + " which costs " + prices[drinksIndex]);
					total = total + prices[drinksIndex];
				}
			}
		}
		
		System.out.println("Your total is: " + total);
	}
}

