import java.util.ArrayList;

class Startup{
	
	private ArrayList<String> locationCells;
	private int numberOfHits = 0;

	public void setLocationCells(ArrayList<String> locs){
		locationCells = locs;
	}

	public void getLocationCells(){
		for(String cell : locationCells){
			System.out.print(cell + " ");
		}
		System.out.println();
	}

	public String checkYourself(String userInput){
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		
		if(index > 0){
			locationCells.remove(index);

			if(locationCells.isEmpty()){
			result = "kill";
			} else { 
			result = "hit"; 
			}
		}

		System.out.println(result);
		return result;
	}
}