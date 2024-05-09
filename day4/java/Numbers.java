import java.util.Scanner;
public class Numbers {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);


		String[][] alphabetTime = new String[3][3];
		
		int rows = alphabetTime.length;
		int column = alphabetTime[0].length;

		System.out.println("Rows: " + rows);
		System.out.println("Column: " + column);
		

	for(int a = 0; a < 9; a++) {
		System.out.print("Enter alpahbet: ");
		String alphabet = scanner.nextLine();
		}
	

	for (int i = 0; i < alphabetTime.length; i++){
		for (int j = 0; j < alphabetTime.length; j++){
			alphabetTime[i][j] = "a";
		}
	}


		if (alphabetTime[rows][column] == "a") {
                	alphabetTime[rows][column] = ( a % 2 == 0);
			( a % 2 == 0) = (x : o);
 			//alphabetTime[column] = "X";
			//(a % 2 == 0);
			//( X : O);
               		a++;
            		} 

		else {
                System.out.println("This cell is already taken. Choose another cell.");
            }
		


	
	

	












}
}