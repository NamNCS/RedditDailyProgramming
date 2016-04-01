import java.util.Scanner;
public class InfoSpitter {
	
	public static void main(String args[])
	{
		
		Scanner keyboard = new Scanner(System.in);
		String name;
		int age;
		String redditName;
		
		System.out.println("What is your name?");
		name = keyboard.next();
		System.out.println("How old are you?");
		age = keyboard.nextInt();
		System.out.println("What is your reddit username?");
		redditName = keyboard.next();
		
		System.out.println("Your name is " + name + ", you are " + age + " years old, and your reddit username is " + redditName +".");
	}
}

