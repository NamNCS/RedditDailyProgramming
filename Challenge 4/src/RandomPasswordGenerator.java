import java.util.Random;
import java.util.Scanner;


public class RandomPasswordGenerator {
	
	public static void main(String args[])
	{
	
	int numberOfPasswords;
	int passwordLength;
	String password;
	
	
		boolean exit = false;
		Scanner keyboard = new Scanner(System.in);
		
		while(exit == false)
		{
		System.out.println("How many passwords do you want to make?");
		numberOfPasswords = keyboard.nextInt();
		
		for(int i = 1; i < numberOfPasswords + 1 ; i++)
		{
			password = "";
			System.out.println("How long do you want password #" + i + " to be?");
			passwordLength = keyboard.nextInt();
			String availChar = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
			char[] selector = availChar.toCharArray();
			
			for(int j = 0; j < passwordLength; j++)
			{
				int k = new Random().nextInt(selector.length);
				password = password + selector[k];
			}
			
			System.out.println(password);
			exit = true;
		}
	}
	}
}
