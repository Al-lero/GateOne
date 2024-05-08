import java.util.Scanner;
public class TaskNine {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int scores = 0;
		int average = 0;
		

	for( int i = 1; i <= 10; i++){
	
		System.out.println("Enter scores: ");
		 scores = scanner.nextInt();
			
		sum += scores;
		}
		if(scores <= -1){
			System.out.println("not valid");
		}

		else{
			System.out.println("valid");
		}

	System.out.println(sum);


}
}