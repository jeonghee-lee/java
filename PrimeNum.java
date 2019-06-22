public class PrimeNum {
	public static void main(String[] args) {
		for ( int i=2; i<=100; i++) {
			boolean isprime = true;
			for (int j=2; j < i/j; j++ ) {
				if ( i%j == 0 ) isprime = false;
			} 
			if (isprime) System.out.println ( i + " is prime number!");
		}
	}
}
