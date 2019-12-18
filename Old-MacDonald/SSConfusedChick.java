/*
* @author - Sohail Shaik
* @Date - Dec 17,2019
* @Assignment - SSConfusedChick
*/
public class SSConfusedChick extends SSChick{
	private String secSound;
	
	/*
	  *set the initial state of the variables
	  *@param - s1 - is the the sound the animal makes
	  *@param - s2 - is the the secound sound the animal makes
	  */
	public SSConfusedChick(String s1, String s2) {
		super(s1);
		secSound = s2;
	}
	
	/*
	  *reutrns the sound of the animal
	  *@returns - the sound of the animal
	  */
	  public String getSound(){
	    if((int)(Math.random()*2) == 1) {
	    	return super.getSound();
	    }else {
	    	return secSound;
	    }
	  }
	  
	  

}
