package ca.demo.salestool;

public class Main	{
	public static void main(String[] args)	{
		SalesData data = new SalesData();
		
		displayGreeting();
		data.display();
		
	}
	
	private static void displayGreeting()	{
		System.out.println("HELLO HAPPY SALE PEOPLE!");
		System.out.println("THIS APP SHOW SALES DATA");
		System.out.println("Test 1");
	}
}