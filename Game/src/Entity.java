import java.awt.Graphics;

/**
* @author - Sohail Shaik
* @Date - Dec 26,2019
* @Assignment - Entity
*/
public abstract class Entity {
	protected float x,y;
	
	public Entity(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);

}
