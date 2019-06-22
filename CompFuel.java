public class CompFuel {
	public static void main ( String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();

		int dist = 252;

		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		
		System.out.println("To go " + dist + " miles minivan needs " + minivan.fuelneeded(dist) + " gallons of fuel." );
		System.out.println("To go " + dist + " miles sportscar needs " + sportscar.fuelneeded(dist) + " gallons of fuel." );
	}
}
