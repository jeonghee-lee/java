public class Guess {
	public static void main ( String[] args ) 
		throws java.io.IOException {
		char ch, answer = 'J';
		System.out.println(" I am thinking of a letter between  A and Z.");
		System.out.print(" Can you guess it: ");
		ch = (char) System.in.read();
		if (ch == answer) {
			System.out.println("** Right **");
		}
		else {
			System.out.println("...Sorry,you're wrong!");
			if ( ch > answer )
				System.out.println("too high!");
			else
				System.out.println("too low!");
		}
	}
}
