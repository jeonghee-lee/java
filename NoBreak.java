public class NoBreak {
	public static void main ( String[] args ) {
		for (int i=0; i<=5; i++) {
			switch (i) {
				case 0 :
					System.out.println("i is less one :" + i );
				case 1 :
					System.out.println("i is less two :" + i );
				case 2 :
					System.out.println("i is less three :" + i );
				case 3 :
					System.out.println("i is less four :" + i );
				case 4 :
					System.out.println("i is less five :" + i );
			}
			System.out.println();
		}
	}
}
