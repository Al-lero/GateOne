import java.util.Scanner;
public class TaskTwo {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int scores = 0;
		int average = 0;
	

	for( int i = 1; i <= 10; i++){
	
		System.out.println("Enter scores: ");
		 scores = scanner.nextInt();
	

			sum += scores;

			average = sum / 10;
	
	}
	
		
		System.out.println(average);

	

	

}
}