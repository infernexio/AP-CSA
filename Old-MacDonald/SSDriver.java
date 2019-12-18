/*
* @author - Sohail Shaik
* @Date - Dec 17,2019
* @Assignment - SSDriver
*/

public class SSDriver {

	public static void main(String[] args) {
		SSAnimal[] animals = new SSAnimal[3];
		animals[0] = new SSCow("Moo");
		animals[1] = new SSChick("chip");
		animals[2] = new SSPig("oink");
		SSFarm farm = new SSFarm(animals);
		
		System.out.println(farm);

	}

}
