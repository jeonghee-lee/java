public class RetMeth {
	public static void main ( String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		System.out.println("minivan can carry " + minivan.passengers + " with range of " + minivan.range() + " miles" );
		System.out.println("sportscar can carry " + sportscar.passengers + " with range of " + sportscar.range() + " miles" );
	}
}
