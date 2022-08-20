class StartupGame{

	public static void main(String[] args){
	
		int numberOfGuesses = 0;	
		GameHelper helper = new GameHelper();

		Startup newGame = new Startup();
		int randomNumber = (int) (Math.random() * 5);
		int[] locations = {randomNumber, randomNumber + 1, randomNumber + 2};

		newGame.setLocationCells(locations);
		boolean isAlive = true;

		while(isAlive == true){
			int guess = helper.getUserInput("Enter a number");
			String result = newGame.checkYourself(guess);
			numberOfGuesses++;

			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numberOfGuesses + " guesses to complete the game.");
			}
			
		}

	}
}