/*
	ISYS 320
	Name(s): Anthony Quehl
	Date: 
	
	6. There is no ouput due to the rounding issues of Java. The answer does not round
	   9.6.
	
*/

public class P6_DoubleProblems {

	public static void main(String[] args) {
		double gpa = 3.2;		
		if(Math.abs((gpa * 3) - 9.6 ) < 0.001 ) {
			System.out.println( "You earned enough credts");
		}
	}

}
