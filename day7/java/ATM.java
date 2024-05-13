import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

	public class ATN {

		public static void main(String[] args){
		

		double balance = 0;
		double withdraw = 0;
		double deposit = 0;

		ArrayList<int[]> listOfMoney = new ArrayList<>();

		

		System.out.println("Welcome to Lero Banking Platform");
	
		
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
			
			if (userInput == 1) {
				System.out.println("To create new account");

				System.out.println("Enter firstName: ");
				String firstName = alero.nextLine();

				System.out.println("Enter lastName: ");
				String lastName = alero.nextLine();

				System.out.println("Enter 4 numbers for pin: ");
				int number = alero.nextInt();

				System.out.println("Account opened successfully");
			}

			if (userInput == 2){
				System.out.println("Account successfully closed");
			}

			if (userInput == 3){
				System.out.println("Deposit money: ");
				 deposit = alero.nextDouble();
				
				System.out.println("Balance : " + deposit);
			}

			if (userInput == 4) {
				System.out.println("Withdraw money: ");
		 		withdraw = alero.nextDouble();

				System.out.println("Balance: " + balance);
 
				}

			if (userInput == 5) {
				System.out.println("Check Account balance: " + balance);
				}

			if (userInput == 6) {
				System.out.println("Transnsfer from one account to another: ");
				

			else{
				System.out.print("Enter 0 to go back to menu");
				int numberEntered = alero.nextInt();
				if (numberEntered == 0){
					System.out.println(Menu);
				}
}


}
}


				
				