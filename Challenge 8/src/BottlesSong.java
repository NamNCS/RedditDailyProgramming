
public class BottlesSong {

	public static void main(String args[])
	{
		for(int i = 99; i > 0;)
		{
			System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
			System.out.print("Take one down, pass it around, ");
			i--;
			System.out.print(i + " bottles of beer on the wall." + '\n');
			if(i == 1)
			{
				System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.");
				System.out.print("Take one down, pass it around, no more bottles of beer on the wall");
				break;
			}
		}
	}
}