import java.util.Scanner;

public class CreditCard {
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
	System.out.print("Enter your credit card number: ");
        String creditCardNumber = scanner.nextLine();
       
        String cardType = getCardType(creditCardNumber);
    
        boolean isValid = isValidCreditCardNumber(creditCardNumber);

        System.out.println("Credit Card Type: " + cardType);
        System.out.println("Validity Status: " + (isValid ? "Valid" : "Invalid"));
    }

  
    public static boolean isValidCreditCardNumber(String creditCardNumber) {
        
        creditCardNumber = creditCardNumber.replaceAll("\\D", "");

        if (creditCardNumber.length() < 13 || creditCardNumber.length() > 16) {
            return false;
        }

       
        int sum = 0;
        boolean alternate = false;
        
        for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(creditCardNumber.substring(i, i + 1));
            
            if (alternate) {
                digit *= 2;
                
                if (digit > 9) {
                    digit = digit % 10 + 1;
                }
            }
           
            sum += digit;
          
            alternate = !alternate;
        }

        return sum % 10 == 0;
    }

   
    public static String getCardType(String creditCardNumber) {
       
        if (creditCardNumber.startsWith("4")) {
            return "Visa";
        } else if (creditCardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (creditCardNumber.startsWith("37")) {
            return "American Express";
        } else if (creditCardNumber.startsWith("6")) {
            return "Discover";
        } else {
            return "Unknown";
        }
    }
}