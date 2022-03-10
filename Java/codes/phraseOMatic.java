public class phraseOMatic{
	public static void main(String args [])
	{
		String[] wordListOne = {"24/7","multi-Tier","30,000 foot","B-to-B","win-win",
		"frontend","web-based", "pervasive", "smart", "sixsigma","critical-path", "dynamic"};
		
		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
"clustered", "branded","outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
		
		String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency",
"strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
	
		int listOneLen = wordListOne.length;
		int listTwoLen = wordListTwo.length;
		int listThreeLen = wordListThree.length;
		
		int index1 = (int)(Math.random() * listOneLen);
		int index2 = (int)(Math.random() * listTwoLen);
		int index3 = (int)(Math.random() * listThreeLen);
		
		String phrase = wordListOne[index1] + " " + wordListTwo[index2] + " " + wordListThree[index3];
		System.out.println("A phrase: " + phrase);
	}
}