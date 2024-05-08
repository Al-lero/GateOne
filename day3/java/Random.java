import java.util.Random;
public class RandomMath {
	
	public static void main(String[] args){
		Random alero = new Random();
		
		int number1 = alero.nextInt(10);
		int number2 = alero.nextInt(10);

	int sum = number1 + number2;
	
	int multiply = number1 * number2;

	int division = number1 / number2;

	int subtraction = number1 - number2;  

	for(int counter = 1; counter <= 10; counter++){
		System.out.print(" would you like sum: ");
		int answe = alero.nextInt();
	
	}
	
	//System.out.println("Random number: " + number2);
	

	//System.out.println("answer " + sum);
	//System.out.println("Multiply: " + multiply);
	//System.out.println("Division: " + division);
	//System.out.println("Subtraction: " + subtraction);



		
	
}
}