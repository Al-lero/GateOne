import java.util.Scanner;
import java.util.Random;
public class RandomMath {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Random alero = new Random();
		
		int number1 = alero.nextInt(10);
		int number2 = alero.nextInt(10);

	int sum = number1 + number2;
	
	//int multiply = number1 * number2;

	//int division = number1 / number2;

	//int subtraction = number1 - number2;  


	int finalScore = 0;
	for(int counter = 1; counter <= 10; counter++){
		System.out.println(number1 + " + " + number2);
		System.out.print("Enter answer: ");
		int answer = scanner.nextInt();
		
		if (answer == sum){
			System.out.println("The answer is correct");
			}
			
		else{
			System.out.println("Wrong answer");
		}

		
	

	
	}
	
	System.out.println("Random number: " + sum);
	

	//System.out.println("answer " + sum);
	//System.out.println("Multiply: " + multiply);
	//System.out.println("Division: " + division);
	//System.out.println("Subtraction: " + subtraction);



		
	
}
}