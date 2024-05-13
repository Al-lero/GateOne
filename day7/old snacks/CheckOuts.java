import java.util.ArrayList;
import java.util.Scanner;

	public class CheckOuts {
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);

String continueShopping;
String item;
int quantity = 0;
double price = 0;
int subTotal = 0;
double discount = 0;
double VAT = 17.50;
double billTotal = 0;
double balance = 0;
int amountPaid = 0;
double result = 0;


			ArrayList<Object> items = new ArrayList<>();

		System.out.println("Enter Customer's name: ");
		String customerName = scanner.nextLine();

		System.out.println("Cashier's name: ");
		String name = scanner.nextLine();


		
		do{
		System.out.println("what do you want to buy: ");
		item = scanner.nextLine();
		
		
		System.out.println("How many pieces: ");
		quantity = scanner.nextInt();
		

		System.out.println("How much per unit: ");
		price = scanner.nextDouble();
		

                result = (quantity * price); 
		subTotal += result;
		
		VAT = (subTotal * 17.50) / 100;
		billTotal = subTotal + VAT - discount;
		balance = amountPaid - billTotal;
					
		
		System.out.println("Do you want to buy something else? (yes/no)?");
		scanner.nextLine();
		continueShopping = scanner.nextLine();
		items.add("\t" + item + "\t" + quantity + "\t" + price + "\t" + (quantity * price));

			}

		while (continueShopping.equalsIgnoreCase("yes"));
	
			System.out.println("How much discount will he get?: ");
			discount = scanner.nextDouble();
			discount = (subTotal * discount) / 100;
			String prompt = """
					WELCOME TO SEMICOLON STORE
					MAIN BRANCH
					LOCATION: 312, HERBERT MARCAULY WAY, SABO YABA LAGOS.
					TEL:09014465195
					
					""";

			
			System.out.print(prompt);
			System.out.println("Cashier's Name: "+ name);
			System.out.println("Customer name: " + customerName);
			System.out.println("====================================================");
			System.out.println("\tITEM\tQTY\tPRICE\tTOTAL(NGN)");
			System.out.println("\n---------------------------------------------------");
			for (Object itemzz : items){
			System.out.println(itemzz);
			}
			System.out.println("\n---------------------------------------------------");
			System.out.printf("\nSubTotal: " + subTotal);
			System.out.printf("\nDiscount: " + discount);
			System.out.printf("\nVAT: " + VAT);
			System.out.printf("\nBill Total: " + billTotal);
			System.out.println("\n====================================================");
			System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY: " + billTotal);
			System.out.println("How much did the Customer give to you: ");
			 amountPaid = scanner.nextInt();
			System.out.printf("\nBalance: " + (amountPaid - billTotal));
			System.out.println("\n====================================================");
			System.out.println("THANK YOU FOR YOUR PATRONAGE");
			



			

			



}
}
	