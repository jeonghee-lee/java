class Example {
	public static void main( String[] arguments ) {
	double  Gallons , Liters;
	int counter = 0;
	for ( Gallons =1; Gallons  <= 30; Gallons++) {
		Liters = Gallons  * 3.78;
		System.out.println( Gallons  + " Gallons  is " + Liters + " Liters!");
		counter++;
		if ( counter == 10 ) {
			System.out.println();
			counter =0;
			}
		}
	}
}
