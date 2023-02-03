public class NumberExampleRecursion {
	public static void main( String[] args ) {
		// write a function that takes in a number and prints it 
		// print first numbers: 1 2 3 4 5\

		print(1);
		}

	static void print( int n ) {
		// base condition 
		if( n > 5 ) {
			return;
		}
		System.out.println(n);
		
		// recursion call 
		// if you are calling a function again and again, you can treat it as a separate call in the stack 
		print( n + 1 );
	}	
}
	
