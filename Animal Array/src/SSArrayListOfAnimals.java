import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author - Sohail Shaik
 * @Date - Jan 22, 20
 * @Assignment - ArrayListOfAnimals
 */

public class SSArrayListOfAnimals {

	public static void main(String args[]) {
		ArrayList<SSAnimal> farm = new ArrayList<SSAnimal>();
		Scanner sc = new Scanner(System.in);
		Scanner stringSc = new Scanner(System.in);
		int userNum;

		userNum = errorCheck("(1) Chick \n(2) Cunfused Chick \n(3) Cow \n(4) Named Cow \n(5) Pig \n(6)"
				+ " Done adding animals \nWhat type of animal would you like to add to the farm?", sc, 6);
		while(userNum < 6) {
			if(userNum == 1) {
				farm.add(new SSChick(errorCheckString("what sound does the chick make?", stringSc)));
				System.out.println("a chick has been added to your farm!");
			}else if (userNum == 2) {
				farm.add(new SSConfusedChick(errorCheckString("what sound does the confused chick make?", stringSc)
						, errorCheckString("what other sound does the confused chick make?", stringSc)));
				System.out.println("a confused chick has been added to your farm!");
			}else if (userNum == 3) {
				farm.add(new SSCow(errorCheckString("what sound does the cow make?", stringSc)));
				System.out.println("a cow has been added to your farm!");
			}else if(userNum == 4) {
				farm.add(new SSNamedCow(errorCheckString("what is the name of the Named cow", stringSc)
						,errorCheckString("what sound does the named Cow make? ", stringSc)));
				System.out.println("a named cow has been added to your farm!");
			}else if(userNum == 5) {
				farm.add(new SSPig(errorCheckString("what sound does the pig make?", stringSc)));
				System.out.println("a pig has been added to your farm!");
			}
			userNum = errorCheck("(1) Chick \n(2) Cunfused Chick \n(3) Cow \n(4) Named Cow \n(5) Pig \n(6)"
					+ " Done adding animals \nWhat type of animal would you like to add to the farm?", sc, 6);
		}
		System.out.println("your Farm is complete");
		
		userNum = errorCheck("(1) Display all animals\r\n" + 
				"(2) Ask an animal to speak\r\n" + 
				"(3) Ask the type of an animal\r\n" + 
				"(4) Ask the name of an animal\r\n" + 
				"(5) Leave the farm", sc);
		while (userNum < 5) {
			if(userNum == 1) {
				System.out.println(farm);
			}else if(userNum == 2) {
				System.out.println("sound = " + farm.get(errorCheck("Enter a number from 0 to " + (farm.size() - 1), sc,farm.size()-1)).getSound());
			}else if(userNum == 3) {
				System.out.println("type = " + farm.get(errorCheck("Enter a number from 0 to " + (farm.size() - 1), sc, farm.size()-1)).getType());
			}else if(userNum == 4) {
				int i = errorCheck("Enter a number from 0 to " + (farm.size() - 1), sc, farm.size()-1);
				if(farm.get(i) instanceof SSNamedCow) {
					System.out.println("name = " + ((SSNamedCow) farm.get(i)).getName());
				}else {
					System.out.println("That position is not a named animal!");
				}
			}
			userNum = errorCheck("(1) Display all animals\r\n" + 
					"(2) Ask an animal to speak\r\n" + 
					"(3) Ask the type of an animal\r\n" + 
					"(4) Ask the name of an animal\r\n" + 
					"(5) Leave the farm", sc);
		}
		System.out.println("thanks for visiting!");
		sc.close();
		stringSc.close();
	}
	
	/**
	 * checks for wrong input to a promt
	 * @param promt - the promt the program wants to ask the user
	 * @param in - a scanner object that is used to check the user input
	 * @return - an int that is checked for the wrong input to a promt
	 */
	public static int errorCheck(String promt, Scanner in) {
		int userNum;
		do {
			System.out.println(promt);
			while (!in.hasNextInt()){
				System.out.println("That was not an int! Try again.");
				in.next();
			}
			userNum = in.nextInt();
			if(userNum  < 0) {
				System.out.println("You can't enter an negative!");
			}
		}while(userNum < 0);
		return userNum;
	}
	/**
	 * checks for wrong input to a promt
	 * @param promt - the promt the program wants to ask the user
	 * @param in - a scanner object that is used to check the user input
	 * @return - an string that is checked for the wrong input to a promt
	 */
	public static int errorCheck(String promt, Scanner in, int max) {
		int userNum;
		do {
			System.out.println(promt);
			while (!in.hasNextInt()){
				System.out.println("That was not an int! Try again.");
				in.next();
			}
			userNum = in.nextInt();
			if(userNum  > max) {
				System.out.println("that is out of the range!");
			}
			if(userNum  < 0) {
				System.out.println("You can't enter an negative!");
			}
		}while(userNum < 0 || userNum > max);
		return userNum;
	}
	
	/**
	 * checks for wrong input to a promt
	 * @param promt - the promt the program wants to ask the user
	 * @param in - a scanner object that is used to check the user input
	 * @return - an int that is checked for the wrong input to a promt
	 */
	public static String errorCheckString(String promt, Scanner in) {
		String str;
		do {
			System.out.println(promt);
			while (!in.hasNext()){
				System.out.println("That was not an String! Try again.");
				in.next();
			}
			str = in.nextLine();
		}while(str.length() < 0);
		return str;
	}

}
