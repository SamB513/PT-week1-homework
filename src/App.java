
public class App {

	public static void main(String[] args) {
		// Week 1 coding assignment
  
		// Question 3, 2 variables created for each data type
		double itemPrice1 =  21.50;
		double itemPrice2 = 12.99;
		
		double moneyInWallet1 = 500;
		double moneyInWallet2 = 50.56;
		
		int numberOfFriends1 = 65;
		int numberOfFriends2 = 250;
		
		int age1 = 31;
		int age2 = 46;
		
		String firstName1 = "Samuel";
		String firstName2 = "Lewis";
		
		String lastName1 = "Braun";
		String lastName2 = "Whitman";
		
		char middleInitial1 = 'H';
		char middleIntitial2 = 'O';
		
		// Question 4a
		double newMoneyInWallet1 = moneyInWallet1 - itemPrice1;
		double newMoneyInWallet2 = moneyInWallet2 - itemPrice2;
		
		// Question 4b
		double friendsPerYear1 = numberOfFriends1 / age1;
		double friendsPerYear2 = numberOfFriends2 / age2;
		 
		// Question4C
		String fullName1 = firstName1 +" " + middleInitial1 + " " + lastName1;
		String fullName2 = firstName2 + " " + middleIntitial2 + " " + lastName2;
		
		//Question 5C
		System.out.println("After buying this item, I have $" + newMoneyInWallet1 + " in my wallet.");
		System.out.println("My friend has $" + newMoneyInWallet2 + " in his wallet after his purchase." );
		System.out.println("I have made " + friendsPerYear1 + " friends a year over the course of my life so far." );
		System.out.println("My sister has made " + friendsPerYear2 +  " friends each year that she has lived.");
		System.out.println( "My full name is " + fullName1 + ".");
		System.out.println( "My college professor's names is " + fullName2 + ".");
		
		
		
		
	}
	

}
