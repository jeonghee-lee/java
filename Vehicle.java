public class Vehicle {
	int	passengers; // number of passengers
	int fuelcap;  // fuel capacity in gallons
	int mpg;   // fuel consumption in miles per gallon

	// return the range
	int range() {
		return fuelcap * mpg;
	}
	// compute fuel needed for a given distance
	double fuelneeded(int miles) {
		return (double) miles / mpg ; 
	}
}
