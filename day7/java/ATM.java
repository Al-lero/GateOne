import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

	public class ATM {

		public static void main(String[] args){
		

		double balance = 0;
		double withdraw = 0;
		double deposit = 0;
		double transfer = 0;

		ArrayList<Integer> listOfMoney = new ArrayList<>();

		

		System.out.println("Welcome to Lero's Banking Platform");
	
		
			String Menu = """
			press
				1-> Create an Account
				2-> Close Account
				3-> Deposit Money
				4-> Withdraw Money
				5-> Check Account Balance
				6-> Transfer from one account to another
				7-> Change pin
				
				""";
			

				System.out.println(Menu);

				

				Scanner alero = new Scanner(System.in);


				System.out.println("Enter your preffered number: ");
				int userInput = alero.nextInt();
			
				balance = deposit - withdraw;
			
			switch(userInput) {
				case 1 -> {
					System.out.println("To create new account");
					 alero.nextLine();
					System.out.println("Enter firstName: ");
					String firstName = alero.nextLine();

					System.out.println("Enter lastName: ");
					String lastName = alero.nextLine();

					System.out.println("Enter 4 numbers for pin: ");
					int number = alero.nextInt();

					System.out.println("Account opened successfully");
				}
				
	

				case 2 -> {
					System.out.println("Account successfully closed");
				}
				

				//case 3:	
					//System.out.println("Deposit money: ");
				 	//deposit = alero.nextDouble();
				
					//System.out.println("Balance : " + deposit);
				
				//break;

				//case 4:
					//System.out.println("Withdraw money: ");
		 			//withdraw = alero.nextDouble();

					//System.out.println("Balance: " + balance);
 
				
				//break;

				//case 5:
					//System.out.println("Check Account balance: " + balance);
				
				//break;

				//case 6:
					//System.out.println("Amount to transfer: ");
					//transfer = alero.nextInt();
		
					//System.out.println("Your balance is: " + balance);
				
				//break;

				//case 7:
					//System.out.println("Change pin: ");
					//int pin = alero.nextInt();

					//System.out.println("Pin changed successfully");
				
				//break;

				//case 8:
				//System.out.print("Enter 0 to go back to menu: ");
				//int numberEntered = alero.nextInt();
				//if (numberEntered == 0){
					//System.out.println(Menu);

					//System.out.println("Enter your preffered number: ");
					// userInput = alero.nextInt();
			//}
			
				
}


}
}


				
				