import java.awt.Graphics;

/**
 * @author - Sohail Shaik
 * @Date - Dec 26,2019
 * @Assignment - gameState
 */
public class GameState extends State {
	
	private Player player;
	private World world;
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 100, 100);
		world = new World(game, "res/worlds/world1.txt");
		
		game.getGameCamera().move(0, 0);
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}