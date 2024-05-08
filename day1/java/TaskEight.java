import java.util.Scanner;
public class TaskEight {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int scores = 0;
		int average = 0;
		

	for( int i = 1; i <= 10; i++){
	
		System.out.println("Enter scores: ");
		 scores = scanner.nextInt();
	
			//if(i % 2 == 0){
				//scores += i;
				
			sum += scores;
			//average = sum / 10;
			
		if(scores <= 0){
			System.out.println("Enter again");
		}

		if (scores <= 100){
			System.out.println(sum);
		}

		else {
			System.out.print("Try Again");
			}
	
	
	}
	}
	}	
		//System.out.println(sum);
		//System.out.println(average);

	

	

