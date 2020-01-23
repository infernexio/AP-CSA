import java.util.Scanner;

/**
* @author - Sohail Shaik
* @Date - Jan 22, 20
* @Assignment - ArrayListOfAnimals
*/

public class SSArrayListOfAnimals {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int userNum;
		
		do {
		System.out.println("(1) Chick \n(2) Cunfused Chick \n(3) Cow \n(4) Named Cow \n(5) Pig \n(6) Done adding animals");
		while (!sc.hasNextInt()){
			System.out.println("That was not an int! Try again.");
			sc.next();
		}
		userNum = sc.nextInt();
		if(userNum  < 0) {
			System.out.println("You can't enter an negatice!");
		}
		}while(userNum < 0);
		
		
	}
}
