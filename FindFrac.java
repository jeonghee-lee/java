public class FindFrac {
	public static void main (String[] args) {
		for ( int i=2; i<=100; i++) {
			boolean isprime = true;
			System.out.print("The Fraction of " + i + ": ");
			for (int j=2;j<=i/2;j++)
				if (i%j == 0) {
					System.out.print(j + " "); 
					isprime = false;
				}
			if (isprime) System.out.print(" ----> prime number.");
			System.out.println();
		}
	}
}
