public class Guess {
	public static void main (String[] args )
	throws java.io.IOException {
		char chr, ignore, answer ='j';
		do {
			System.out.println (" I am thinking a letter between a and z");
			System.out.print(" Can you guess it: ");
			chr = (char) System.in.read();	
			do {
				ignore = (char) System.in.read();
			} while ( ignore != '\n' );
			if (chr == answer) { 
				System.out.println("** Right **");
			}
			else {
				System.out.print("... Sorry, you are ");
				if (chr > answer) 
					System.out.println("too high");
				else 
					System.out.println("too low");
				System.out.println("Try again!\n");
			}
		} while (chr != answer );
	}
}
