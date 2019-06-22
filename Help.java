public class Help {
	public static void main( String[] args) 
		throws java.io.IOException {
			System.out.println("Help on:");
			System.out.println("\t1. if");
			System.out.println("\t2. switch");
			System.out.print("Choose one:");
			char choice = (char) System.in.read();
			switch (choice) {
				case '1' :
					System.out.println("The if:\n");
					System.out.println("if (condition) statement;");
					System.out.println("else statement;");
					break;
				case '2' :
					System.out.println("The switch:\n");
					System.out.println("switch (expression) {");
					System.out.println(" case constant:");
					System.out.println("    statement sequence");
					System.out.println("    break;");
					System.out.println("    //...");
					System.out.println("}");
					break;
				default:
					System.out.println("Selection not found!");
			}
	}
}
