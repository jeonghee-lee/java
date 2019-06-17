public class Power {
	public static void main (String[] args) {
		for (int i=1;i <10;i++) {
			int result = 1;
			int e=i;
			while (e>0) {
				result *= 2;
				e--;
			}
			System.out.println("2 to the " + i + " power is " + result );
		}	
	}
}
