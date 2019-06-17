class Ch {
	public static void main ( String [] args ) {
	char chr= 0;
	for ( int i=1; i<=2048;i++) {
		int ichr= (int) chr;
		System.out.println(" char [" + ichr +"] is [" + chr + "]");
		chr++;
	}
}
}
