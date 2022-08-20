class Startup{
	
	private int[] locationCells;
	public int numberOfHits = 0;

	public void setLocationCells(int[] locs){
		locationCells = locs;
	}

	public void getLocationCells(){
		for(int cell : locationCells){
			System.out.print(cell + " ");
		}
		System.out.println();
	}

	public String checkYourself(int guess){
		String result = "miss";
		for(int cell : locationCells){
			if(guess == cell){
				result = "hit";
				numberOfHits++;		
				break;
			}
		}
		if(numberOfHits == locationCells.length){
			result = "kill";
		}
		System.out.println(result);
		return result;
	}
}