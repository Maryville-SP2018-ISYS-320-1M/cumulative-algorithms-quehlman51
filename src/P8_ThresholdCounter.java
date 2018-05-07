import java.util.Scanner;

/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
*/

public class P8_ThresholdCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		System.out.print( "How many numbers are in the series? ");
		int x = input.nextInt();
		System.out.print( "What is the threshold? ");
		int threshold = input.nextInt();
	
		int numberAbove = 0;
		
		for(int i = 0; i < x; i++) {
			System.out.print( "Enter number " + (i + 1) + ": " );
			int n = input.nextInt();
			
			if(n > threshold) {
				numberAbove++;
			}
		}
		
		input.close();
		System.out.println("The count of numbers above the threshold is:  " + numberAbove);
	}

}
