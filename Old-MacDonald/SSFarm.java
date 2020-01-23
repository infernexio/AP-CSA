/**
 * @author - Sohail Shaik
 * @Date - Dec 17,2019
 * @Assignment - SSPig
 */
public class SSFarm {
	private SSAnimal[] animalarr;

	/**
	 *set the initial state of the variables
	 *@param - arr - is an arr of animals given by client
	 */
	public SSFarm(SSAnimal[] arr) {
		animalarr = arr;
	}

	/**
	 *returns the state of the class
	 *@returns - the state of the class
	 */
	public String toString() {
		String str = "";
		for(int i = 0; i < animalarr.length; i++) {
			if(animalarr[i] instanceof SSNamedCow) {
				str +=  "The " + ((SSNamedCow) animalarr[i]).getType() + " " + ((SSNamedCow) animalarr[i]).getName() + " goes " + animalarr[i].getSound();
			}else {
				str  +=  animalarr[i].toString() + " ";
			}
		}
		return str;

	}

}
