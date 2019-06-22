public class ForTest {
	public static void main( String[] args ) 
	throws java.io.IOException {
		char chr;
		System.out.print("Press q to stop.");
		for ( int i=0; (chr = (char) System.in.read()) != 'q' ; i++ ) {
			System.out.println("Press #" + i + " chr[" + chr + "]");
		}
	}
}
