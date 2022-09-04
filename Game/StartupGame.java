import java.util.ArrayList;

class StartupGame{

	public static void main(String[] args){
	
		int numberOfGuesses = 0;	
		GameHelper helper = new GameHelper();

		Startup newGame = new Startup();
		int randomNumber = (String) (Math.random() * 5);
		
		ArrayList<String> locations;
		locations.add(randomNumber); 
		//locations.add(randomNumber + 1);
		//locations.add(randomNumber + 2};

		newGame.setLocationCells(locations);
		boolean isAlive = true;

		while(isAlive == true){
			String guess = helper.getUserInput("Enter a number");
			String result = newGame.checkYourself(guess);
			numberOfGuesses++;

			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numberOfGuesses + " guesses to complete the game.");
			}
			
		}

	}
}