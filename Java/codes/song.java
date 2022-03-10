public class song{
	public static void main(String args[])
	{
		int numBeer = 99;
		String word = "Bottles";
		
		while(numBeer > 0)
		{
			
			System.out.println(numBeer + " " + word + " of beer on the wall");
			System.out.println(numBeer + " " + word + " of beer");
			System.out.println("Take one down");
			System.out.println("pass it around");
			
			numBeer = numBeer - 1;
			
			if(numBeer == 1)
				word = "Bottle";
			
			if(numBeer > 0)
				System.out.println(numBeer + " " + word + " of beer on the wall");
			else
				System.out.println("No more bottles of beer on the wall");
		}
	}
}