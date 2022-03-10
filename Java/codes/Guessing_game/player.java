import java.util.Random;

public class player{
	String name;
	int guessedNumber;
	
	public player(){}
	
	public player(String name){
		this.name = name;
	}
	
	public void guess(){
		Random rand = new Random();
		guessedNumber = rand.nextInt(10);
	}
}