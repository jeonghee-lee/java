public class kbIn {
	public static void main ( String[] args )
		throws java.io.IOException {
			char ch;
			int ich;
			System.out.print("Press a key followed by Enter: ");
			ich = System.in.read();
			ch = (char) ich;
			System.out.println("Your input[" + ich + "] is: " + ch);
	}
}
