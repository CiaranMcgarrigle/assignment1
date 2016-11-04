package assignment1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Ciaran McGarrigle
 *
 */

public class Driver {
	private Scanner input;
	private ArrayList<String> words;
	
	public static void main(String [] args) throws IOException
	{
		Driver driver = new Driver();
	}
	
	/**
	 * Sets up the driver
	 */
	public Driver() throws IOException
	{
		input = new Scanner(System.in);
		words = new ArrayList<String>();
		run();
	}
	
	/**
	 * Sets up the main menu and allows the user to pick an option
	 */
	private int mainMenu()
	{
		int command = 0;
		System.out.println("Choose An Option");
		System.out.println("1) Add Terms To Array");
		System.out.println("2) Brute Force");
		System.out.println("3) Print Terms");
		System.out.println("0) Exit");
		command = input.nextInt();
		return command;
	}
	
	/**
	 * Adds the terms from wiktionary to an ArrayList
	 * @return words ArrayList
	 * @throws FileNotFoundException 
	 */
	
	private ArrayList<String> addTerms() throws IOException
	{
		File usersFile = new File("wiktionary.txt");
		Scanner terms = new Scanner(usersFile);
		while (terms.hasNext()){
			words.add(terms.nextLine());
		}
		return words;
	}
	
	/**
	 * Print the list of terms added to the ArrayList
	 */
	private void printTerms(){
		for (int i=0; i<words.size();i++)
			System.out.println(words.get(i));
	}
	/**
	 * Runs the program and uses switch statements to allow the user to pick an option 
	 * @throws IOException
	 */
	private void run() throws IOException
	{
		int choice = mainMenu();
		while(choice != 0)
		{
			switch(choice)
			{
			case 1:
				addTerms();
			break;
			case 2:
				bruteForce();
			break;
			case 3:
				printTerms();
			break;
			default:
				System.out.println("Invalid option entered");
			break;
			}
			
			input.nextLine();
			choice = mainMenu();
		}
	}
	
	/**
	 * Uses a BruteForce method to search for a substring in the list of terms and 
	 * returns the terms which contain that substring
	 */
	private void bruteForce()
	{
		input.nextLine();
		String search = input.nextLine();
		for(int i = 0;i<words.size();i++){
			if (words.get(i).contains(search))
			{
				System.out.println(words.get(i));
			}
		}
	}

}
