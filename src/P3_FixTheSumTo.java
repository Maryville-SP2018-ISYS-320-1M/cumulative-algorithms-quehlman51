/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
3. What problems did you identify in the sumTo method below?
	Needed to move the sum integer definition from inside the for loop to outside.
    Added the return statment for the method
*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		int totalSum = sumTo(5);
		System.out.println("The total sum is: " + totalSum );

	}
	
	public static int sumTo(int n) {    
		int sum = 0; 
	   	for (int i = 1; i <= n; i++) { 
	        sum += i;
	    }
		return sum;
	}	
}
