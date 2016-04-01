import java.util.Scanner;

//Write a function that takes two strings and removes from the first string any character that appears
//in the second string. For instance, if the first string is ÅgDaily ProgrammerÅh and the second string is 
//Ågaeiou Åh the result is ÅgDlyPrgrmmrÅh.

public class StringCompareAndRemove {

	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the first string.");
		String one = keyboard.nextLine();
		System.out.println("Enter the second string. Any characters in this string will be removed from the first one");
		String two = keyboard.nextLine();
		String removedString = "";
		keyboard.close();
		String[] firstString = one.split("", 0);
		String[] secondString = two.split("", 0);
		
		for(int i = 0; i < firstString.length; i++)
		{
			for(int j = 0; j < secondString.length; j++)
			{
				if(firstString[i].equals(secondString[j]) == true)
				{
					firstString[i] = "";
				}
			}
			removedString = removedString + firstString[i];
		}
		
		System.out.println(removedString);
	}
}
