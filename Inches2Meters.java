class Inches2Meters {

public static void main(String[] args) {
	double inches, meters;
	int counter = 0;
	for ( inches=1;inches <= 12*12; inches++) {
		meters = inches / 39.37;
		System.out.println(inches + " inches are " + meters + " meters!");
		counter++;
		if ( counter == 12) {
			System.out.println();
			counter = 0;
		}
	}
}
}
