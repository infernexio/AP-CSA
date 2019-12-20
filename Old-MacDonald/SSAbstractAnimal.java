/**
* @author - Sohail Shaik
* @Date - Dec 17,2019
* @Assignment - SSAbstractAnimal
*/

public class SSAbstractAnimal implements SSAnimal{
  private String sound;
  private String type;

  /**
  *set the initial state of the var
  *@param - animaltype- is the type of animal
  *@param - animalsound - is the the sound the animal makes
  */
  public SSAbstractAnimal(String animaltype, String animalsound){
    sound = animalsound;
    type = animaltype;
  }

  /**
  *reutrns the sound of the animal
  *@returns - the sound of the animal
  */
  public String getSound(){
    return sound;
  }

  /**
  *returns the type of the animal
  *@returns - the type of animal this is
  */
  public String getType(){
    return type;
  }
  
   /**
   *returns the state of the class
   *@returns - the state of the class
   */
  public String toString(){ 
	  if(this instanceof SSNamedCow) {
		  return  ((SSNamedCow) this).getType() + " " + ((SSNamedCow) this).getName() + " goes " + this.getSound();
	  }
	  return "The " + this.getType() + " goes " + this.getSound();
  }
}