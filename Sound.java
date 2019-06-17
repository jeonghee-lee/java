class Sound {
	public static void main ( String[] args ) {
	double distance;
	for (int sec=1;sec <=10;sec++) {
		distance = sec * 335.28;
		System.out.println("The lighting after sound of " + sec + " seconds is approximately " + distance + " meters away from you" );
	}
}
}
