import java.util.Scanner;
public class TaskOne {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int scores = 0;
		int total = 0;
	

	for( int i = 1; i <= 10; i++){
	
		System.out.println("Enter scores: ");
		 scores = scanner.nextInt();
	

			sum += scores;
	
	}
	
		System.out.print(sum);

	


}
}