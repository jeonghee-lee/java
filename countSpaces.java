public class countSpaces {
	public static void main ( String[]  args) 
		throws java.io.IOException {
		char chr;
		int spaces=0;
		do {
			chr = (char) System.in.read();
			if ( chr == ' ' ) spaces++;
		} while ( chr != '.');
		System.out.println("Total count of spaces is " + spaces );
	}
}
