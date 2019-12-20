/**
* @author - Sohail Shaik
* @Date - Dec 17,2019
* @Assignment - SSNamedCow
*/
public class SSNamedCow extends SSCow{
	private String name;
	  /**
	  *set the initial state of the variables
	  *@param - nm - is the name of the cow
	  *@param - sound - is the the sound the animal makes
	  */
	public SSNamedCow (String nm, String sound) {
		super(sound);
		name = nm;
	}
	
	/**
	  *returns the name of the animal
	  *@returns - the name of animal this is
	  */
	public String getName() {
		return name;
	}
	
	/**
	  *returns the type of the animal
	  *@returns - the type of animal this is
	  */
	public String getType() {
		return "Confused " + super.getType();
	}
}
