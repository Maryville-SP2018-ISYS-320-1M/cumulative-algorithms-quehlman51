import java.util.Scanner;

/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/

public class P5_CumulativeProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print( "How many numbers do you want to multiply? ");
		int x = input.nextInt();
	
		int product = 1;
		
		for(int i = 0; i < x; i++) {
			System.out.print( "Enter number " + (i + 1) + ": " );
			int n = input.nextInt();
			product *= n;
		}
		
		input.close();
		System.out.println("The final product is: " + product);
		
	}

}
