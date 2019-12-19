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
		animalarr = new SSAnimal[arr.length];
		for(int i = 0; i < arr.length; i++) {
			animalarr[i] = arr[i];
		}
	}
	
	   /**
	   *returns the state of the class
	   *@returns - the state of the class
	   */
	public String toString() {
		String str = "";
		for(int i = 0; i < animalarr.length; i++) {
			 str  +=  animalarr[i].toString() + " ";
		}
		return str;
		
	}

}
