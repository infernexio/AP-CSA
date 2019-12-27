import java.awt.Graphics;

/**
* @author - Sohail Shaik
* @Date - Dec 26,2019
* @Assignment - gameState
*/
public class gameState extends State {
	
	private Player p;
	
	public gameState(Game game) {
		super(game);
		 p = new Player(game, 100, 100);
	}

	public void tick() {
		p.tick();
	}
	
	public void render(Graphics g) {
		p.render(g);
	}

}
