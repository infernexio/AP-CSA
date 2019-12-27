import java.awt.Graphics;

/**
* @author - Sohail Shaik
* @Date - Dec 26,2019
* @Assignment - State
*/
public abstract class State {
	private static State currentState;
	
	 public static void setState(State state) {
		 currentState = state;
	 }
	 
	 public static State getState() {
		 return currentState;
	 }
	 
	 protected Game game;
	 
	 public State(Game game) {
		 this.game = game;
	 }


	public abstract void tick();
	public abstract void render(Graphics g);

}
