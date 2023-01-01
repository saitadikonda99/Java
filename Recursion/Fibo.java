// fibonacci number in java

public class Fibo {
	public static void main( String[] args ) {
		int ans = fibo( 6 );
		System.out.println( ans );
		}
	static int fibo( int n ) {
		// if the n value is less than two return n
		// base condition  
		if( n < 2 ) {
		 	return n;
			}

		return fibo( n - 1 ) + fibo( n - 2 );
		}

	}

