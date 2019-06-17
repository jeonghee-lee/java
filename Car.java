class Vehicle {
	protected String brand = "Honda";
	public void honk() {
		System.out.println("Bbang, Bbang!");
	}
}

class Car extends Vehicle {
	private String modelName = "Carrence";
	public static void main( String[] args) {
		Car mycar = new Car();

		mycar.honk();
		System.out.println(mycar.brand + " " + mycar.modelName );
	}
}
