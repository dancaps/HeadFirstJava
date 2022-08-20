class StartupTestDrive{

	public static void main(String[] args){
		Startup test = new Startup();
		int[] locations = {2, 3, 4};
		test.setLocationCells(locations);
		System.out.print("This is the location: ");
		test.getLocationCells();
		for(int i = 0; i < 7; i++){
			System.out.println(i);
			test.checkYourself(i);
			System.out.println(test.numberOfHits);
		}	
	}
}