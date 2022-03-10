import java.util.Random;

public class GuessGame{
	player p1;
	player p2;
	player p3;
	
	int randomNumber;
	
	public void startGame(){
		System.out.println("Let game begin!!!");
		Random randomClass = new Random();
		// nextInt(a), random value generated from 0 to a-1 inclusive
		randomNumber = randomClass.nextInt(10);
		System.out.println("Random number to guess "+randomNumber);
		
		System.out.println("Initializing players");
		p1 = new player("Jeremy");
		p2 = new player("James");
		p3 = new player("Richard");
		System.out.println("The players are "+p1.name+" "+p2.name+" "+p3.name);
		
		System.out.println("Players start guessing!");
		do{
			p1.guess();
			System.out.println("player 1's guess "+p1.guessedNumber);
			p2.guess();
			System.out.println("player 2's guess "+p2.guessedNumber);
			p3.guess();
			System.out.println("player 3's guess "+p3.guessedNumber);
			System.out.println("players try again!");
		}while(p1.guessedNumber != randomNumber && p2.guessedNumber != randomNumber && p3.guessedNumber != randomNumber);
		
		if(p1.guessedNumber == randomNumber){
			System.out.println("player 1 is the winner!!!!");
		}
		if(p2.guessedNumber == randomNumber){
			System.out.println("player 2 is the winner!!!!");
		}
		if(p3.guessedNumber == randomNumber){
			System.out.println("player 3 is the winner!!!!");
		}
		
		System.out.println("End of the game, thank you");
	}
}