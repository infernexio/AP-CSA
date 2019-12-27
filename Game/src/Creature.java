/**
* @author - Sohail Shaik
* @Date - Dec 26,2019
* @Assignment - Creature
*/
public abstract class Creature extends Entity {
	protected int health;

	public Creature(float x, float y) {
		super(x, y);
		health = 10;
	}
	

}
