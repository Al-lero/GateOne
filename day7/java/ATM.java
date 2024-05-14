import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 0;
        double deposit = 0;
        double withdraw = 0;
        double transfer = 0;

        ArrayList<String> listOfTransactions = new ArrayList<>();

        Scanner alero = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to Lero's Banking Platform");

            String mainMenu = """
                    Press
                    1 -> Create an Account
                    2 -> Close Account
                    3 -> Deposit Money
                    4 -> Withdraw Money
                    5 -> Check Account Balance
                    6 -> Transfer from one account to another
                    7 -> Change pin
                    8 -> Exit
                    9 -> View Transactions
                    """;

            System.out.println(mainMenu);

            System.out.println("Enter your preferred number: ");
            int userInput = alero.nextInt();

            switch (userInput) {
                case 1 -> {
                    System.out.println("To create new account");
                    alero.nextLine(); // Consume the newline
                    System.out.println("Enter firstName: ");
                    String firstName = alero.nextLine();

                    System.out.println("Enter lastName: ");
                    String lastName = alero.nextLine();

                    System.out.println("Enter 4 numbers for pin: ");
                    int pin = alero.nextInt();
                    if (String.valueOf(pin).length() != 4) {
                        System.out.println("Invalid pin, must be 4 digits");
                    } else {
                        System.out.println("Account opened successfully");
                        listOfTransactions.add("Account opened by " + firstName + " " + lastName);
                    }
                }
                case 2 -> {
                    System.out.println("Account successfully closed");
                    listOfTransactions.add("Account closed");
                }
                case 3 -> {
                    System.out.println("Deposit money: ");
                    deposit = alero.nextDouble();
                    balance += deposit;
                    System.out.println("Balance: " + balance);
                    listOfTransactions.add("Deposited: " + deposit);
                }
                case 4 -> {
                    System.out.println("Withdraw money: ");
                    withdraw = alero.nextDouble();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Balance: " + balance);
                        listOfTransactions.add("Withdrawn: " + withdraw);
                    } else {
                        System.out.println("Insufficient funds");
                    }
                }
                case 5 -> System.out.println("Check Account balance: " + balance);
                case 6 -> {
                    System.out.println("Amount to transfer: ");
                    transfer = alero.nextDouble();
                    if (transfer <= balance) {
                        balance -= transfer;
                        System.out.println("Your balance is: " + balance);
                        listOfTransactions.add("Transferred: " + transfer);
                    } else {
                        System.out.println("Insufficient funds");
                    }
                }
                case 7 -> {
                    System.out.println("Change pin: ");
                    int newPin = alero.nextInt();
                    if (String.valueOf(newPin).length() != 4) {
                        System.out.println("Invalid pin, must be 4 digits");
                    } else {
                        System.out.println("Pin changed successfully");
                        listOfTransactions.add("Pin changed");
                    }
                }
                case 8 -> {
                    System.out.println("Exiting...");
                    alero.close(); // Close the scanner before exiting
                    System.exit(0);
                }
                case 9 -> {
                    System.out.println("Transactions: ");
                    for (String transaction : listOfTransactions) {
                        System.out.println(transaction);
                    }
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
